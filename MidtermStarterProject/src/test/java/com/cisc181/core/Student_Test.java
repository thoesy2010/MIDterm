package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eStaff;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Student_Test extends Student {
	

	private Object Course;
	private Semester Semester;
	private Section Section;
	public Student_Test(String FirstName, String MiddleName, String LastName, Date DOB, eMajor Major, String Address,
			String Phone_number, String Email,Course c,Section s,Semester e,double GPA,double avg) {
		super(FirstName, MiddleName, LastName, DOB, Major, Address, Phone_number, Email);
		this.Course=c;
		this.Section=s;
		this.Semester=e;
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void onceExecutedBeforeAll() throws java.text.ParseException {
		ArrayList<Course> courseArray = new ArrayList<Course>(2);
		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		courseArray.add(c1);
		courseArray.add(c2);
		courseArray.add(c3);
		
		ArrayList<Semester> SemesterArray = new ArrayList<Semester>(1);
		Semester s = new Semester();
		Semester f = new Semester();
		SemesterArray.add(s);
		SemesterArray.add(f);
		
		ArrayList<Section> SectionArray = new ArrayList<Section>(5);
		Section s1 = new Section();
		Section s2 = new Section();
		Section s3 = new Section();
		Section s4 = new Section();
		Section s5 = new Section();
		Section s6 = new Section();
		SectionArray.add(s1);
		SectionArray.add(s2);
		SectionArray.add(s3);
		SectionArray.add(s4);
		SectionArray.add(s5);
		SectionArray.add(s6);
		
		
		ArrayList<Student> stuArray = new ArrayList<Student>(9);
		Date dBirthDate1 = null;
		Date dBirthDate2 = null;
		Date dBirthDate3 = null;
		Date dBirthDate4 = null;
		Date dBirthDate5= null;
		Date dBirthDate6= null;
		Date dBirthDate7= null;
		Date dBirthDate8= null;
		Date dBirthDate9= null;
		Date dBirthDate10 = null;

		try {
			dBirthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
			dBirthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("1916-07-31");
			dBirthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("1895-07-31");
			dBirthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("1000-07-31");
			dBirthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
			dBirthDate6 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
			dBirthDate7 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
			dBirthDate8 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
			dBirthDate9 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
			dBirthDate10 = new SimpleDateFormat("yyyy-MM-dd").parse("1923-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Student_Test stu = new Student_Test("Bert", "Randall", "Gibbons", dBirthDate1, eMajor.NURSING, "214 Labrador Lane",
				"302-893-6889", "bgibbons@udel.edu",c1,s1,s,4.0,100);
		Student_Test stu2 = new Student_Test("Bart", "Roll", "Gab", dBirthDate2, eMajor.PHYSICS, "214 Labrador Lane", "911",
				"bgibbons@udel.edu",c2,s6,f,4.0,100);
		Student_Test stu3 = new Student_Test("Beer", "Raindow", "Gibboons", dBirthDate3, eMajor.COMPSI, "214 Labrador Lane",
				"3026889", "bgibbons@udel.edu",c1,s1,f,4.0,100);
		Student_Test stu4 = new Student_Test("Ben", "Rap", "Gions", dBirthDate4, eMajor.BUSINESS, "214 Labrador Lane", "30",
				"bgibbons@udel.edu",c3,s2,s,2.0,70);
		Student_Test stu5 = new Student_Test("Bill", "Row", "Goofy", dBirthDate5, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c1,s4,f,3.0,85);
		Student_Test stu6 = new Student_Test("Bill", "Row", "Goofy", dBirthDate6, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c3,s5,s,3.5,90);
		Student_Test stu7 = new Student_Test("Bill", "Row", "Goofy", dBirthDate7, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c1,s2,f,1.0,60);
		Student_Test stu8 = new Student_Test("Bill", "Row", "Goofy", dBirthDate8, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c2,s6,f,2.0,70);
		Student_Test stu9 = new Student_Test("Bill", "Row", "Goofy", dBirthDate9, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c2,s3,s,4.0,100);
		Student_Test stu10 = new Student_Test("Bill", "Row", "Goofy", dBirthDate10, eMajor.CHEM, "214 Labrador Lane", "308936889",
				"bgibbons@udel.edu",c1,s3,s,4.0,100);
		//Course c,Section s,Semester e
		stuArray.add(stu);
		stuArray.add(stu2);
		stuArray.add(stu3);
		stuArray.add(stu4);
		stuArray.add(stu5);
		stuArray.add(stu6);
		stuArray.add(stu7);
		stuArray.add(stu8);
		stuArray.add(stu9);
		stuArray.add(stu10);
	}
	@Test
	public void test(){
		//assertEqual() NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
		
	}

}
