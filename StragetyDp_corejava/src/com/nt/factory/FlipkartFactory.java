package com.nt.factory;

import com.nt.component.BlueDart;
import com.nt.component.Courier;
import com.nt.component.Dtdc;
import com.nt.component.Flipkart;

public class FlipkartFactory 
{
	public static Flipkart getInstance(String couriertype)
	{
		// create dependent class obj
		Courier courier = null;
		if(couriertype.equalsIgnoreCase("dtdc"))
		{
			courier=new Dtdc();
		}
		else if(couriertype.equalsIgnoreCase("bluedart"))
		{
			courier = new BlueDart();
		}
		else
		{
			throw new IllegalArgumentException();
		}
		
		// create target class obj
		Flipkart fpkt = new Flipkart();
		//assinging dependent class obj to target class obj
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
