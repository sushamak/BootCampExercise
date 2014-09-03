package com.tdd.filter;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.tdd.filter.NumberFactory.NumberType;


public class NumberFilterSpec {

	@Test
	public void itShouldReturnMePrimeNumbers() {

		// given
		List<Integer> inputNumber = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		// when
		
		NumberFilter numberFilter = new NumberFilter();
		List<Integer> primeNoList = numberFilter.filter(inputNumber, Arrays.asList(NumberType.PRIME), 0, 0);
		int[] actual = toPrimitive(primeNoList);
		// then
		int[] expecteds = { 2, 3, 5, 7, 11, 13 };
		Assert.assertArrayEquals(expecteds, actual);
	}

	@Test
	public void itShouldReturnMeOddNumbers() {

		// given
		List<Integer> inputNumbers = Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		// when
		NumberFilter numberFilter =  new NumberFilter();
		List<Integer> oddNoList = numberFilter.filter(inputNumbers, Arrays.asList(NumberType.ODD), 0, 0);
		int[] actual = toPrimitive(oddNoList);
		// then
		int[] expecteds = { 1, 3, 5, 7, 9, 11, 13, 15 };
		Assert.assertArrayEquals(expecteds, actual);
	}

	@Test
	public void itShouldReturnMeOddPrimeNumbers() {
		// given
		List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		// when
		NumberFilter numberFilter = new NumberFilter();
		List<Integer> oddNoList = numberFilter.filter(inputNumbers, Arrays.asList(NumberType.PRIME, NumberType.ODD),0,0);
		int[] actual = toPrimitive(oddNoList);
		// then
		int[] expecteds = { 3, 5, 7, 11, 13 };
		Assert.assertArrayEquals(expecteds, actual);
	}

	@Test
	public void itShouldReturnMeNumbersBetween5And10() {
		// given
		List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		int lowerLimit = 5;
		int upperLimit = 10;
		// when
		NumberFilter numberFilter = new NumberFilter();
		List<Integer> bet5And10 = numberFilter.filter(inputNumber, Arrays.asList(NumberType.RANGE), lowerLimit, upperLimit);
		int[] actual = toPrimitive(bet5And10);
		// then
		int[] expecteds = { 5, 6, 7, 8, 9, 10 };
		Assert.assertArrayEquals(expecteds, actual);
	}

	@Test
	public void itShouldReturnOddPrimesBetween2and31() {
		// given
		List<Integer> inputNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
				16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
				32, 33, 34, 35);
		int lowerLimit = 2;
		int upperLimit = 31;
		// when
		NumberFilter numberFilter = new NumberFilter();
		List<Integer> bet5And10 = numberFilter.filter(inputNumber, Arrays.asList(NumberType.ODD,NumberType.PRIME,NumberType.RANGE), lowerLimit, upperLimit);
		int[] actual = toPrimitive(bet5And10);
		// then
		int[] expecteds = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
		Assert.assertArrayEquals(expecteds, actual);

	}

	private int[] toPrimitive(List<Integer> actual) {
		int[] result = new int[actual.size()];
		for (int i = 0; i < actual.size(); i++) {
			result[i] = actual.get(i);
		}
		return result;
	}

}
