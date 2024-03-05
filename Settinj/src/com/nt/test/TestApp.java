package com.nt.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.target.Person;

public class TestApp 
{
	public static void main(String[] args) 
	{
		XmlBeanFactory factory = new XmlBeanFactory((new FileSystemResource("src/com/nt/config/Applicationcontext.xml")));
		Person p = factory.getBean("Per",Person.class);
		System.out.println(p);
		
		Class c= Person.class;
		Class c1 =TestApp.class;
		
		System.out.println("c obj class name::"+c.getClass()+"........."+"c obj name::"+c.toString());
		System.out.println("c obj class name::"+c1.getClass()+"........."+"c obj name::"+c1.toString());
	}
}
