package com.coderolls.SampleProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberHelperTest {

	@Test
	public void testIsEven() {
		
		int sampleNum = 2;
		
		NumberHelper numberHelper = new NumberHelper();
		assertTrue(numberHelper.isEven(sampleNum)); 
	}
	

	@Test
	public void testIsEven_FalseCondition() {
		
		int sampleNum2 = 3;
		
		NumberHelper numberHelper = new NumberHelper();
		assertFalse(numberHelper.isEven(sampleNum2)); 
	}

}
