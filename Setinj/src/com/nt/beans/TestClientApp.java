package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestClientApp {

	public static void main(String[] args) 
	{
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("com/config/Applicationcontext.xml","com/config/Applicationcontext.out.xml");
		Flipkart obj=(Flipkart) factory.getBean("fpk");
		System.out.println(obj.getCustomername());
		System.out.println(obj.getId());
		System.out.println(obj.getLocation());
		System.out.println("...................................");
		System.out.println(obj.getPhnpay().getBankname());
		System.out.println(obj.getPhnpay().getTransid());
		System.out.println("..................................... ");
		
		String res=obj.userName("muni","Sbi");
		System.out.println(res);
		System.out.println("________________________________________________________");
		Flipkart ff=(Flipkart)factory.getBean("fp");
		System.out.println(ff.getCustomername());
		System.out.println(ff.getLocation());
		System.out.println(ff.getId());

	}

}
