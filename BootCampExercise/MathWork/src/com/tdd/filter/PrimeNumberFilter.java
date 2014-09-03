package com.tdd.filter;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFilter implements BaseFilter {

	public List<Integer> filterNumber(List<Integer> numbers) {
		List<Integer> primeNumber = new ArrayList<>();
		for (int number : numbers) {
			if (isPrime(number)) {
				primeNumber.add(number);
			}

		}
		return primeNumber;
	}

	private boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(number); j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}

}
