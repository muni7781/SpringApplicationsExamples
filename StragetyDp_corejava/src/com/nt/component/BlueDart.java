package com.nt.component;
//Dependent class
public final class BlueDart implements Courier 
{
	public BlueDart()
	{  
		System.out.println("BlueDart::0-param constructor exceuted");
	}
	@Override
	public String deliever(int oid) 
	{
		return "Delivering"+oid+"order id products using BLueDart";
	}
}
