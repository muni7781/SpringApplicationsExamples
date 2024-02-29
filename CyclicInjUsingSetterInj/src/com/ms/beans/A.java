package com.ms.beans;

public class A 
{
	private int id;
	private String name;
	private B b;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public A() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("0::param constructor is excueted");
	}
	public B getB() 
	{
		return b;
	}
	public void setB(B b) 
	{
		this.b = b;
	}
	@Override
	public String toString() 
	{
		return id+" "+name+" "+ b.getLocation();
	}

}
