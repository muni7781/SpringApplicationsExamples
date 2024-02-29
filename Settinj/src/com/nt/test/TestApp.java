package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.target.Person;

public class TestApp {

	public static void main(String[] args) 
	{
		XmlBeanFactory factory = new XmlBeanFactory((new FileSystemResource("src/com/nt/config/Applicationcontext.xml")));
		Person p = (Person) factory.getBean("Per");
		System.out.println(p);

	}

}
