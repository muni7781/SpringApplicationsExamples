package com.ms.beans;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp 
{

	public static void main(String[] args) 
	{
		FileSystemResource res = new FileSystemResource("src/com/ms/configuration/ApplicationContext.xml");
		XmlBeanFactory fac = new XmlBeanFactory(res);
		A aa=(A)fac.getBean("a1");
		System.out.println(aa);
		System.out.println("--------------------------");
		B bb =(B)fac.getBean("b1");
		System.out.println(bb);
		
	
	}
}
