package com.nt.component;

public class FedEx implements Courier 
{
	public FedEx() 
	{
		System.out.println("FEDEX::0-param constructor is excuted.");
	}

	@Override
	public String deliever(int oid) 
	{
		return "Delivering"+oid+"order id products using FEDEx";
	}

}
