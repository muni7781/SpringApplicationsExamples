package com.target.beans;
import java.util.*;
public class Demo2 
{
	private int id;
	private String subject;
	private int mobile;
	
	private List<String>name;
	private Set<String>city;
	private Map<String, String>dict;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getSubject() 
	{
		return subject;
	}
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}
	public int getMobile() 
	{
		return mobile;
	}
	public void setMobile(int mobile) 
	{
		this.mobile = mobile;
	}
	public List<String> getName() 
	{
		return name;
	}
	public void setName(List<String> name) 
	{
		this.name = name;
	}
	public Set<String> getCity() 
	{
		return city;
	}
	public void setCity(Set<String> city) 
	{
		this.city = city;
	}
	public Map<String, String> getDict() 
	{
		return dict;
	}
	public void setDict(Map<String, String> dict) 
	{
		this.dict = dict;
	}
}
