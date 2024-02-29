package com.ms.beans;

public class B 
{
	private String location;
	private A a;
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}
	public A getA() 
	{
		return a;
	}
	public void setA(A a) 
	{
		this.a = a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return location+" "+a.getId()+" "+a.getName();
	}
}
