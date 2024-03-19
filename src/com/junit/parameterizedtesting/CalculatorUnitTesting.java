package com.junit.parameterizedtesting;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculatorUnitTesting {
	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {{5,25},{10,100}});
	}
	private int input;
	private int expected;
	public CalculatorUnitTesting(int input, int expected) {
		this.input = input;
		this.expected = expected;
	}
	@Test
	public void testMethod() {
		System.out.println("Running Parameterized tests");
		Assert.assertEquals("Test failed",expected,Calculator.square(input));
		
	}
	

}
