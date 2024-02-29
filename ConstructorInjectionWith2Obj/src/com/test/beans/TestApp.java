package com.test.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.target.beans.WishMessageGenerator;

public class TestApp 
{
	public static void main(String[]args)
	{
		FileSystemResource Fs = new FileSystemResource("src/com/cfg/beans/Applicationcontext.xml");
		XmlBeanFactory fac = new XmlBeanFactory(Fs);
		WishMessageGenerator obj=(WishMessageGenerator)fac.getBean("wmg");
		String Result=obj.UserMessage("MUNI");
		System.out.println(Result);
	
	}

}
