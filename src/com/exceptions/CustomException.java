package com.exceptions;

public class CustomException {

	public static void main(String[] args) {
		try {
			checkValidateVotersAge(12);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void checkValidateVotersAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not valid age exception!", new Exception());
		}
	}

}
