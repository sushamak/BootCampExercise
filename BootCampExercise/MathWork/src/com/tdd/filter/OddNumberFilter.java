package com.tdd.filter;

import java.util.ArrayList;
import java.util.List;

public class OddNumberFilter implements BaseFilter {

	@Override
	public List<Integer> filterNumber(List<Integer> input) {
		List<Integer> oddNumber = new ArrayList<>();
		for (int number : input) {
			if (isOdd(number)) {
				oddNumber.add(number);
			}
		}
		return oddNumber;
	}

	private boolean isOdd(int number) {
		if (number % 2 != 0) {
			return true;
		}
		return false;
	}

}
