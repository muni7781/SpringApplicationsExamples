package com.nt.beans;

public class Flipkart
{
	private String id;
	private String customername;
	private String location;
	private PhonePay phnpay;
	
	public PhonePay getPhnpay() 
	{
		return phnpay;
	}
	public void setPhnpay(PhonePay phnpay) 
	{
		this.phnpay = phnpay;
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
//b.invoke the method
	
	public String userName(String customer,String BankName)
	{
		if(customername.equalsIgnoreCase(customer) &(getPhnpay().getBankname().equalsIgnoreCase(BankName)))
		{
			return "Payment accepted";
		}
		else
		{
			return "Payment not accepted";
		}
	}
}
