package com.coderolls.SampleProject;

import org.junit.Test;

import junit.framework.TestCase;

public class PasswordGeneratorTest extends TestCase {
	
	@Test
	public void testGeneratePassword() {
		String name= "Joseph";
		int yearOFBirth = 1998;
		
		String expected = "Jose1998";
		
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		String actual = passwordGenerator.generatePassword(name, yearOFBirth);
		assertEquals(expected, actual);
	}

	@Test
	public void testGeneratePassword_nameLessThan4Charaters() {
		String name= "Nic";
		int yearOFBirth = 2002;
		
		String expected = "Nic2002";
	
		PasswordGenerator passwordGenerator = new PasswordGenerator();
		String actual = passwordGenerator.generatePassword(name, yearOFBirth);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGeneratePassword_nameIsNull() {
		String name= null;
		int yearOFBirth = 2002;

		PasswordGenerator passwordGenerator = new PasswordGenerator();
		String actual = passwordGenerator.generatePassword(name, yearOFBirth);
		
		assertNull(actual);
	}
}
