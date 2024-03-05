package com.nt.Test;

import com.nt.component.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StargetyTest 
{
	public static void main(String[]args)
	{
		Flipkart fp = FlipkartFactory.getInstance("dtdc");
		
		String result=fp.shopping(new String[] {"shirt","trouser","watch"},new float[]{400.2f,300.2f,500.0f});
		System.out.println(result);
	}

}
