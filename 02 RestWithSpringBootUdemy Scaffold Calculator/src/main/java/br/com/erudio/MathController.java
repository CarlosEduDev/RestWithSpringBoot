package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
			throws Exception {
		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new Exception();
		}
		Double sum = convertToDouble(numberOne) + convertToDouble(numberTwo);
		return sum;
	}

	private Double convertToDouble(String strNumber) {
		if(strNumber==null) return 0D;
		String number = strNumber.replaceAll(",",".");
		if(isNumber(number)) return Double.parseDouble(strNumber);
		return 0D;
	}

	private boolean isNumber(String strNumber) {
		if(strNumber==null) return false;
		String number = strNumber.replaceAll(",",".");
		return number.matches("[\\d.]+");
			
	}

}
