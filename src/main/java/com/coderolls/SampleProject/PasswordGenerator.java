package com.coderolls.SampleProject;

public class PasswordGenerator {
	/**
	 * A method generate password from name and year of birth
	 * 
	 * Ex. For name 'Thomas' and Year of birth '1992', it will generate password as 'Thom1992'.
	 * 
	 * If name has equal to or less than 4 character then it will return name+YearOfith as password.
	 * 
	 * Ex. For name 'Mary' and year of birth '2003', it will return 'Mary2003' as password.
	 * 
	 * @param name
	 * @param yearOfBirth
	 * @return
	 */
	public String generatePassword(String name, int yearOfBirth) {
		String password = null;
		
		if(name ==null) {
			return password;
		}
		
		if(name.length()<=4) {
			password = name+yearOfBirth; 
		}else {
			String str = name.substring(0, 4);
			password =str+yearOfBirth;
		}
		return password;
	}

}
