package com.demo.beans;

import com.demo.exception.WrongOperatorException;

public class Calculator {
	public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
		switch (operator) {
		case "Addition":
			return number1 + number2;
		case "Substraction":
			return number1 - number2;
		case "Muti":
			return number1 * number2;
		case "Diision":
			if (number2 == 0) {
				throw new ArithmeticException("Cannot divivde by 0");
			}
			return number1 / number2;
		case "%":
			if (number2 == 0) {
				throw new ArithmeticException("Modulo by 0 is ");
			}
			return number1 % number2;
		default:
			throw new WrongOperatorException("Invalid choice " );
		}

	}
}
