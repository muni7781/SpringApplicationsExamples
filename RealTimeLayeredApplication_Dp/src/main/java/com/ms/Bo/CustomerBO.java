package com.ms.Bo;

public class CustomerBO 
{
	private String custname;  //Better to take Wrapper Types;
	private String custaddrs;
	private float principleamount;
	private float rateofinterset;
	private float timeofintersert;
	private float intrestamount;
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
	public float getIntrestamount() {
		return intrestamount;
	}
	public void setIntrestamount(float intrestamount) {
		this.intrestamount = intrestamount;
	}
	//toString....
	@Override
	public String toString() 
	{
		return "CustomerBO [custname=" + custname + ", custaddrs=" + custaddrs + ", principleamount=" + principleamount
				+ ", rateofinterset=" + rateofinterset + ", timeofintersert=" + timeofintersert + ", intrestamount="
				+ intrestamount + "]";
	}
	
}
