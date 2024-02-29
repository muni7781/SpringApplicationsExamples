package com.client.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.target.beans.Demo2;

public class Test {

	public static void main(String[] args) 
	{
		FileSystemResource res= new FileSystemResource("src/com/config/ApplicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Demo2 dd = (Demo2)factory.getBean("dm");
		
		System.out.println(dd.getId());
		System.out.println(dd.getSubject());
		System.out.println(dd.getMobile());
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		
		System.out.println(dd.getCity());
		System.out.println(dd.getDict());
		System.out.println(dd.getName());
		 

	}

}
