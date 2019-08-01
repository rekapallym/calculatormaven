package com.manic.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSubtract {
	@Test
	public void testSubtraction() {
		System.out.println("subtraction");
		Integer x = 10;
		Integer y = 5;
		Integer expResult = 5;
		Integer result = Calculator.Subtraction(x, y);
		assertEquals(expResult, result);
		assertEquals(null,Calculator.Subtraction(15, null));
		assertEquals(null,Calculator.Subtraction(null, 15));
		assertEquals(null,Calculator.Subtraction(null, null));
		
	}

}
