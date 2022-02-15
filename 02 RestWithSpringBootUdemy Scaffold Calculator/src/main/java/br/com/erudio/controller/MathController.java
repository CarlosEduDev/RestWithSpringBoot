package br.com.erudio.controller;

import org.springframework.web.bind.annotation.*;
import br.com.erudio.exception.UnsupportedMathOperationException;
import br.com.erudio.utils.MathUtil;
import br.com.erudio.utils.NumberUtil;

@RestController
public class MathController {

	@GetMapping(value = "sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo){
		if (!NumberUtil.isNumber(numberOne, numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.sum(numberOne, numberTwo);
	}
	
	@GetMapping(value = "subtraction/{numberOne}/{numberTwo}")
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.subtraction(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "multiplication/{numberOne}/{numberTwo}")
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.multiplication(numberOne, numberTwo);
	}
	
	
	
	@GetMapping(value = "division/{numberOne}/{numberTwo}")
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.division(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "mean/{numberOne}/{numberTwo}")
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
		if (!NumberUtil.isNumber(numberOne,numberTwo)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.mean(numberOne, numberTwo);
	}
	
	
	@GetMapping(value = "squareRoot/{number}")
	public Double squareRoot(@PathVariable("number") String number) {
		if (!NumberUtil.isNumber(number)) {
			throw new UnsupportedMathOperationException("Please se a numeric value");
		}
		return MathUtil.squareRoot(number);
	}
	
}
