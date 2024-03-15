package com.ms.VO;

public class CustomerVo 
{
	private String custname;  
	private String custaddrs;
	private String principleamount;
	private String rateofinterset;
	private String timeofintersert;
	public String getCustname() 
	{
		return custname;
	}
	public void setCustname(String custname) 
	{
		this.custname = custname;
	}
	public String getCustaddrs() 
	{
		return custaddrs;
	}
	public void setCustaddrs(String custaddrs) 
	{
		this.custaddrs = custaddrs;
	}
	public String getPrincipleamount() 
	{
		return principleamount;
	}
	public void setPrincipleamount(String principleamount) 
	{
		this.principleamount = principleamount;
	}
	public String getRateofinterset() 
	{
		return rateofinterset;
	}
	public void setRateofinterset(String rateofinterset) 
	{
		this.rateofinterset = rateofinterset;
	}
	public String getTimeofintersert() 
	{
		return timeofintersert;
	}
	public void setTimeofintersert(String timeofintersert) 
	{
		this.timeofintersert = timeofintersert;
	}
	@Override
	public String toString() 
	{
		return "CustomerVo [custname=" + custname + ", custaddrs=" + custaddrs + ", principleamount=" + principleamount
				+ ", rateofinterset=" + rateofinterset + ", timeofintersert=" + timeofintersert + "]";
	}
}
