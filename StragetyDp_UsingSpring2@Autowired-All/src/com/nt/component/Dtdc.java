package com.nt.component;

//Dependent class
public final class Dtdc implements Courier
{
	public Dtdc() 
	{
	   System.out.println("DTDC::0-param onstructor");
	}

	@Override
	public String deliever(int oid) 
	{
		return "Delivering"+oid+"order id products using dtdc";
	}

}
