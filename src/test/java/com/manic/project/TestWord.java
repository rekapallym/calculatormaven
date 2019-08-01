package com.manic.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestWord {
	@Test
	public void testword() {
		System.out.println("word count");
		Integer expres = 3;
		String word = "manikanta";
		Integer result = Calculator.countA(word);
		assertEquals(expres,result);
		
	}

}
