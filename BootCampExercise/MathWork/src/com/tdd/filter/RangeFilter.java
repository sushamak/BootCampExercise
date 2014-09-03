package com.tdd.filter;

import java.util.ArrayList;
import java.util.List;

public class RangeFilter implements BaseFilter {

	int lowerLimit;
	int upperLimit;

	public RangeFilter(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	@Override
	public List<Integer> filterNumber(List<Integer> input) {
		List<Integer> rangeNumbers = new ArrayList<>();
		for (Integer number : input) {
			if (isInRange(number)) {
				rangeNumbers.add(number);
			}
		}
		return rangeNumbers;
	}

	private boolean isInRange(Integer number) {
		if (number <= upperLimit && number >= lowerLimit) {
			return true;
		}
		return false;
	}

}
