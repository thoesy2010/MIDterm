package com.cisc181.core;

import java.util.Date;

import com.cisc181.eNums.eStaff;

public class Staff extends Employee {

	 private eStaff Title;

	   public Staff(eStaff title){
	        this.Title = title;
	    }

	    public void setTitle(eStaff title){
	        this.Title = title;
	    }
	    public eStaff getTitle(){
	        return this.Title;
	    }

    

    
	public Staff(String FirstName, String MiddleName, String LastName,
			Date DOB, String Address, String Phone_number, String Email,
			String officeHours, int rank, double salary, Date hireDate,
			eStaff Title) 
	
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number,
				Email, officeHours, salary, hireDate);
		
		this.Title = Title;
	}

}