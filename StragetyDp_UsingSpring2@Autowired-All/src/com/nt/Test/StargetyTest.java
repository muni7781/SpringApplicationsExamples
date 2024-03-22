package com.nt.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.component.Flipkart;

public class StargetyTest
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/ms/config/Applicationcontext.xml");
		//get Target class Object
		Flipkart fp=ctx.getBean("Fpkt",Flipkart.class);
		 String rs=fp.shopping(new String[] {"watch","car"}, new float[] {900.3f,200.3f});
		System.out.println(rs);
	}
} 
