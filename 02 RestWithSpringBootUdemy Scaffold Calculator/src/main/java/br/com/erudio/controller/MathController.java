package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtil;
import br.com.erudio.utils.NumberUtil;

@RestController
public class MathController {

	@RequestMapping(value = "sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if (!NumberUtil.isNumber(numberOne, numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.sum(numberOne, numberTwo);
	}
	
	@RequestMapping(value = "subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.subtraction(numberOne, numberTwo);
	}
	
	
	@RequestMapping(value = "multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.multiplication(numberOne, numberTwo);
	}
	
	
	
	@RequestMapping(value = "division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.division(numberOne, numberTwo);
	}
	
	
	@RequestMapping(value = "mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.mean(numberOne, numberTwo);
	}
	
	
	@RequestMapping(value = "squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) {
		if (!NumberUtil.isNumber(number)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.squareRoot(number);
	}
	
}
