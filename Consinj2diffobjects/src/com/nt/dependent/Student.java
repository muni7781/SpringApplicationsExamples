package com.nt.dependent;

import java.util.List;

import com.nt.target.CourseMaterial;

public class Student 
{
	private String name;
	private int rollno;
	private String marks;
	private String subject;
	private List values;
	private CourseMaterial material;

	public Student(String name, int rollno, String marks, String subject, List values, CourseMaterial material) 
	{
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.subject = subject;
		this.values = values;
		this.material = material;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getRollno() 
	{
		return rollno;
	}

	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}

	public String getMarks() 
	{
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	public List getValues() 
	{
		return values;
	}
	public void setValues(List values) {
		this.values = values;
	}

	public CourseMaterial getMaterial() 
	{
		return material;
	}

	public void setMaterial(CourseMaterial material) 
	{
		this.material = material;
	}

	//b.invoke method
	public String userName(String user)
	{
		if(name.equalsIgnoreCase(user))
		{
			return "Name Matched::";
		}
		else
		{
			return "Name notMatched::";
		}
	}
}
