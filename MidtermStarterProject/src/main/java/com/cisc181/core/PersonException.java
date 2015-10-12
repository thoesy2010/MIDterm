package com.cisc181.core;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import ch.qos.logback.core.boolex.Matcher;

public class PersonException extends Exception {

	private Date DOB;
	private String phone_number;

	public class AgeError extends Exception {

		public AgeError() {
			super("The Age you've entered is not valid");
		}
	}

	public class PhoneError extends Exception {

		public PhoneError() {
			super("The Phone Number you've entered is not valid");
		}
	}

	public boolean testDOB() {
		//use get age from Person class and modify it
			Calendar today = Calendar.getInstance();
			Calendar birthDate = Calendar.getInstance();

			int age = 0;
			birthDate.setTime(this.DOB);
			if (birthDate.after(today)) {
				throw new IllegalArgumentException("Can't be born in the future");
			}
			age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

			// If birth date is greater than todays date (after 2 days adjustment of
			// leap year) then decrement age one year
			if ((birthDate.get(Calendar.DAY_OF_YEAR)
					- today.get(Calendar.DAY_OF_YEAR) > 3)
					|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
				age--;

				// If birth date and todays date are of same month and birth day of
				// month is greater than todays day of month then decrement age
			} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
					&& (birthDate.get(Calendar.DAY_OF_MONTH) > today
							.get(Calendar.DAY_OF_MONTH))) {
				age--;
			}


			try{ 
				if(age>100){
					throw new AgeError();
				}}
			catch(AgeError ex){	
				System.out.println("Your age "+age+" is not valid");
				
				return false;
			}
			return true;
		}
		
		/**
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(DOB);
		int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
		try {
			if (age > 100) {
				throw new AgeError();
			}
		} catch (AgeError ex) {
			System.out.println("Your age is not valid");
			return false;
		}
		return true;
*/
	

	public boolean testPhone() {
		/**
		 * List phoneNumbers = new ArrayList(); phoneNumbers.add("1234567890");
		 * phoneNumbers.add("123-456-7890"); phoneNumbers.add("123.456.7890");
		 * phoneNumbers.add("123 456 7890"); phoneNumbers.add("(123) 456 7890");
		 * 
		 * //Invalid phone numbers phoneNumbers.add("12345678");
		 * phoneNumbers.add("12-12-111");
		 **/
		try {
			String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";

			Pattern pattern = Pattern.compile(regex);

			java.util.regex.Matcher matcher = pattern.matcher(getPhone_number());

			if (matcher.matches() == false) {
				throw new PhoneError();
			}
		} catch (PhoneError ex) {
			System.out.println("Your Phone Number "+getPhone_number()+" is not valid");
			return false;
		}
		return true;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dob) {
		this.DOB = dob;
	}
}

/**
 * Create an instance of the PersonException class, to be thrown to the caller
 * 
 * @param DOB
 * 
 * 
 *            public PersonException(Date DOB) { this.DOB = DOB; } public
 *            PersonException(String phone_number){ this.phone_number =
 *            phone_number; } public Date getBirthday(){ return DOB; } public
 *            String getPhone_number(){ return phone_number; }
 * 
 *            }
 */
/*
 * public static void main(String [] args) { // private Date today =
 * Date(2015,10,10); //Person c = new Person();
 * 
 * try { Person()
 * 
 * }catch(PersonException e) { System.out.println("Sorry, but you are short $" +
 * e.getAmount()); e.printStackTrace(); } }
 */