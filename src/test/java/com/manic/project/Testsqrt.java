package com.manic.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testsqrt {
@Test
public void testsqrt() {
	System.out.println("Square root");
	Integer x = 7;
	Integer expres = 49;
	Integer result = Calculator.sqrt(x);
	assertEquals(expres, result);
	
}
}
