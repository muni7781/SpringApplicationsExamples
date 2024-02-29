package com.nt.target;

public class CourseMaterial 
{
	private String faculty;
	private String coursename;
	public CourseMaterial(String faculty, String coursename) 
	{
		super();
		this.faculty = faculty;
		this.coursename = coursename;
	}
	public String getFaculty() 
	{
		return faculty;
	}
	public void setFaculty(String faculty) 
	{
		this.faculty = faculty;
	}
	public String getCoursename() 
	{
		return coursename;
	}
	public void setCoursename(String coursename) 
	{
		this.coursename = coursename;
	}
}
