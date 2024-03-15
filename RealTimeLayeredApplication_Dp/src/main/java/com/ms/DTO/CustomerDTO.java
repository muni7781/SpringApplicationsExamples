package com.ms.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable
{
	private String custname;  
	private String custaddrs;
	private float principleamount;
	private float rateofinterset;
	private float timeofintersert;
	public String getCustname() 
	{
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustaddrs() {
		return custaddrs;
	}
	public void setCustaddrs(String custaddrs) {
		this.custaddrs = custaddrs;
	}
	public float getPrincipleamount() {
		return principleamount;
	}
	public void setPrincipleamount(float principleamount) {
		this.principleamount = principleamount;
	}
	public float getRateofinterset() {
		return rateofinterset;
	}
	public void setRateofinterset(float rateofinterset) {
		this.rateofinterset = rateofinterset;
	}
	public float getTimeofintersert() {
		return timeofintersert;
	}
	public void setTimeofintersert(float timeofintersert) {
		this.timeofintersert = timeofintersert;
	}
	@Override
	public String toString() {
		return "CustomerDTO [custname=" + custname + ", custaddrs=" + custaddrs + ", principleamount=" + principleamount
				+ ", rateofinterset=" + rateofinterset + ", timeofintersert=" + timeofintersert + "]";
	}
	

}
