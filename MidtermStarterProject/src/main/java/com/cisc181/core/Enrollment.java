package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	private Enrollment(){
	}
	private Enrollment(UUID studentID,UUID SectionID){
	this.StudentID=studentID;
	this.SectionID=SectionID;
	this.EnrollmentID=EnrollmentID;
	}
	
	 public void SetGrade(double grade){
		 this.Grade=grade;
}
	 
}

