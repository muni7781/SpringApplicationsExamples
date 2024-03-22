package com.nt.component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

// target class
public final class Flipkart 
{
	//HAS-A PROPERTY
	@Autowired
	@Qualifier("courier")
	private Courier cou;   //fieldLevel Injection 
	
  
	public Flipkart(@Qualifier("ekrt") Courier cou) 
	{
		super();
		System.out.println("Flipkart::constructor 1-param");
		this.cou = cou;
	}


	public Courier getCourier() 
	{
		return cou;
	}
	
	@Autowired
	@Qualifier("blue")
	public void setCourier(Courier cou)      //setterInjection
	{
		System.out.println("setcourier...calling:;");
		this.cou = cou;
	}  
	
	
   @Autowired
	@Qualifier("fedex")
	public void assign(Courier cou)            //aribuitary Injection(same signature as the Setter Name)
	{
		System.out.println("assign()...calling:;");
		this.cou = cou;
	} 
	
	// business method
	public String shopping(String[]items, float[]prices)
	{
		float billamt = 0.0f;
     for(float p: prices)
	{
			billamt = billamt+p;
	}
		//generate order id
		int oid = new Random().nextInt(1000);
		//use courier
		String msg=cou.deliever(oid);
		return Arrays.toString(items)+"with prices"+Arrays.toString(prices)+"having brilliant"+"bill amunt"+"::::::"+msg+cou.deliever(oid);
		
	}
}
//}
