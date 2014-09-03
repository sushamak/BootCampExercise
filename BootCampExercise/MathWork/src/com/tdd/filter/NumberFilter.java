package com.tdd.filter;

import java.util.List;

import com.tdd.filter.NumberFactory.NumberType;

public class NumberFilter {
	public List<Integer> filter(List<Integer> input, List<NumberType> list, int lowerLimit, int upperLimit){
		BaseFilter filter= null;
		for (NumberType numberType : list) {
			filter = NumberFactory.getInstance(numberType, lowerLimit, upperLimit);
			input = filter.filterNumber(input);
		}
		return input;
		
	}
}
