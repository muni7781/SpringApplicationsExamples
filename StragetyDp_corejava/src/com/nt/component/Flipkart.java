package com.nt.component;

import java.util.Arrays;
import java.util.Random;

// target class
public final class Flipkart 
{
	private Courier courier;
	
	public Flipkart() 
	{
		System.out.println("Flipkart::0-param constructor");
	}

	public Courier getCourier() 
	{
		return courier;
	}

	public void setCourier(Courier courier) 
	{
		System.out.println("setcourier:;");
		this.courier = courier;
	}
	
	// business method
	public String shopping(String[]items, float[]prices)
	{
		float billamt = 0.0f;
		for(float p: prices)
		{
			billamt = billamt+p;
		}
		// generate order id
		int oid = new Random().nextInt(1000);
		// use courier
		String msg=courier.deliever(oid);
		return Arrays.toString(items)+"with prices"+Arrays.toString(prices)+"having brilliant"+"bill amunt"+"::::::"+msg+courier.deliever(oid);
		
	}
	
}
