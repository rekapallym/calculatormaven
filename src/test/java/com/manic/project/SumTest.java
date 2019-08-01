package com.manic.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {
@Test
public void testSum() {
	System.out.println("sum");
	Integer x = 15;
	Integer y = 15;
	Integer expResult = 30;
	Integer result = Calculator.Sum(x, y);
	assertEquals(expResult, result);
	assertEquals(null,Calculator.Sum(15, null));
	assertEquals(null,Calculator.Sum(null, 15));
	assertEquals(null,Calculator.Sum(null, null));
	
}


}
