package com.ms.test;
import java.util.*;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ms.CONTROLLER.MainController;
import com.ms.VO.CustomerVo;
public class ClientApplication 
{
	public static void main(String[]args)
	{
		//Read inputs from enduser as String Values
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Customer name");
		String name=scan.nextLine();
		System.out.println("Enter Customer Address");
		String address=scan.nextLine();
		System.out.println("Enter Principal Amount");
		String principalamount=scan.nextLine();
		System.out.println("Enter rate of interest");
		String rateinterest =scan.nextLine();
		System.out.println("Enter time of interest");
		String timeofinterest=scan.nextLine();
		
		//create Customer Vo class object
		
		CustomerVo vo = new CustomerVo();
		vo.setCustname(name);
		vo.setCustaddrs(address);
		vo.setPrincipleamount(principalamount);
		vo.setRateofinterset(rateinterest);
		vo.setTimeofintersert(timeofinterest);
		//Create ioc container
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ms/CONFIG/ApplicationContext.xml");
		//Get Controller Object
		MainController controller=factory.getBean("control", MainController.class);
		//invoke methods
		try
		{
		String result=controller.processCustomer(vo);
		System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Internal Problem.....TryAgain"+e.getMessage() );
		}
	}
}
