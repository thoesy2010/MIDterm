package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.xml.bind.JAXBContext;

import org.junit.Test;
import com.cisc181.core.PersonException;
import com.cisc181.eNums.eStaff;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.sun.xml.internal.ws.util.Pool.Marshaller;

public class Staff_Test extends PersonException {

	@Test
	public void test() throws java.text.ParseException {
		ArrayList<Staff> myArray = new ArrayList<Staff>(4);
		Date dBirthDate1 = null;
		Date dBirthDate2 = null;
		Date dBirthDate3 = null;
		Date dBirthDate4 = null;
		Date dBirthDate5 = null;
		Date hireDate1 = null;
		Date hireDate2 = null;
		Date hireDate3 = null;
		Date hireDate4 = null;
		Date hireDate5 = null;

		try {
			hireDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("2011-06-01");
			hireDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2000-07-01");
			hireDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2010-06-01");
			hireDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("2015-06-01");
			hireDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1991-06-01");
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1916-07-31");
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1895-07-31");
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1000-07-31");
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Staff sta = new Staff("Bert", "Randall", "Gibbons", dBirthDate1, "214 Labrador Lane", "302-893-6889",
				"bgibbons@udel.edu", "Monday1-5", 1, 20, hireDate1, eStaff.BIG);
		Staff sta2 = new Staff("Bart", "Roll", "Gab", dBirthDate2, "214 Labrador Lane", "911", "bgibbons@udel.edu",
				"Monday1-5", 1, 0, hireDate2, eStaff.BIG);
		Staff sta3 = new Staff("Beer", "Raindow", "Gibboons", dBirthDate3, "214 Labrador Lane", "3026889",
				"bgibbons@udel.edu", "Monday1-5", 1, 200, hireDate3, eStaff.BIG);
		Staff sta4 = new Staff("Ben", "Rap", "Gions", dBirthDate4, "214 Labrador Lane", "30", "bgibbons@udel.edu",
				"Monday1-5", 1, 12, hireDate4, eStaff.BIG);
		Staff sta5 = new Staff("Bill", "Row", "Goofy", dBirthDate5, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu", "Monday1-5", 1, 18, hireDate5, eStaff.BIG);
		myArray.add(sta);
		myArray.add(sta2);
		myArray.add(sta3);
		myArray.add(sta4);
		myArray.add(sta5);
		double monee = 0;
		// test case about salary
		monee = sta.getSalary() + sta2.getSalary() + sta3.getSalary() + sta4.getSalary() + sta5.getSalary();

		// Test avg salary
		assertEquals(50, monee / 5, 0.1);

		// Second test case about phone number
		for (int i = 0; i < 5; i++) {

			setPhone_number(myArray.get(i).getPhone());

			boolean nonono = testPhone();

			if (i == 0) {
				assertTrue(nonono == true);
			} else
				assertTrue(nonono == false);
		}
		// Third test case about phone DOB
		for (int i = 0; i < 5; i++) {

			setDOB(myArray.get(i).getDOB());
			boolean wut = testDOB();

			if (i == 0 || i == 1 || i == 4) {

				assertTrue(wut == true);

			} else
				assertTrue(wut == false);
		}

	}

}
