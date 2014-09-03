package com.tdd.filter;

public class NumberFactory {
	public enum NumberType {
		PRIME, ODD, ODDPRIME, RANGE, RANGE_ODDPRIMES;
	}

	public static BaseFilter getInstance(NumberType numberType,
			int lowerLimit, int upperLimit) {
		switch (numberType.name()) {
		case "PRIME":
			return new PrimeNumberFilter();
		case "ODD":
			return new OddNumberFilter();
		case "RANGE":
			return new RangeFilter(lowerLimit, upperLimit);
		default:
			return null;

		}
	}
}
