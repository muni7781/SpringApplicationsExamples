package com.nt.component;

public class Ekart implements Courier 
{
	public Ekart() 
	{
		System.out.println("Ekart 0::param constructor");
	}

	@Override
	public String deliever(int oid) 
	{
		return "Delivering"+oid+"order id products using Ekart";
	}

}
