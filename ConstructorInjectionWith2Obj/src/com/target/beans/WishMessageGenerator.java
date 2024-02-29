package com.target.beans;

import java.util.Date;

public class WishMessageGenerator 
{
	private Date date;
	
	public WishMessageGenerator(Date date) 
	{
		System.out.println("Constructor Exceuted::");
		this.date = date;
	}
	
	//b. invoke method
	
	public String UserMessage(String user)
	{
		int hour=date.getHours();
		
		if(hour<8)
		{
			return "GOOD MORNING USER::";
		}
		else if(hour <12)
		{
			return "GOOD AFTERNOON USER::";
		}
		else if(hour <18)
		{
			return "GOOD EVENING::";
		}
		else
		{
			return "GOOD NIGHT::";
		}
	}
}
