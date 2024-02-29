package com.nt.target;

public class Person 
{
	private int pid;
	private String pname;
	private String paddrs;
	private String income;
	
	public Person(int pid, String pname, String paddrs, String income) 
	{
		this();
		this.pid = pid;
		this.pname = pname;
		this.paddrs = paddrs;
		this.income = income;
	}

	public Person() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return pid+" "+pname+" "+paddrs+" "+" "+income;
	}

}
