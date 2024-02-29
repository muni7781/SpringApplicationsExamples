package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.dependent.Student;
import com.nt.target.CourseMaterial;

public class TestApp 
{
	public static void main(String[] args) 
	{
		
		FileSystemResource fs = new FileSystemResource("src/com/nt/beans/ApplicationContext.xml");
		XmlBeanFactory fac= new XmlBeanFactory(fs);
		Student st = (Student) fac.getBean("Stu");
		System.out.println(st.getMarks());
		System.out.println(st.getValues());
		System.out.println(st.getRollno());
		System.out.println(st.getSubject());
		System.out.println(st.getMaterial().getCoursename());
		System.out.println("-----------------------------");
		String res=st.userName("Muni");
		System.out.println(res); 	
	}
}
