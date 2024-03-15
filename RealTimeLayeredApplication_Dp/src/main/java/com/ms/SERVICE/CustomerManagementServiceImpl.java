package com.ms.SERVICE;

import com.ms.Bo.CustomerBO;
import com.ms.DAO.CustomerDAO;
import com.ms.DTO.CustomerDTO;

public final class CustomerManagementServiceImpl implements ICustomerMgmtService
{
	private CustomerDAO dao;
	
	public CustomerManagementServiceImpl(CustomerDAO dao) 
	{
		super();
		System.out.println("CustomerManagementseriveimpl::1-param consttructor");
		this.dao = dao;
	}
	

	@Override
	public String calculateSimpleInterestAmount(CustomerDTO dto) throws Exception
	{
		//calculate simple interest Amomunt;
		Float interestamount = dto.getPrincipleamount()*dto.getRateofinterset()*dto.getTimeofintersert()/100.0f;
		//create Bo class obj having persistable data
		CustomerBO bo = new CustomerBO();
		bo.setCustname(dto.getCustname());
		bo.setCustaddrs(dto.getCustaddrs());
		bo.setPrincipleamount(dto.getPrincipleamount());
		bo.setRateofinterset(dto.getRateofinterset());
		bo.setTimeofintersert(dto.getTimeofintersert());
		bo.setIntrestamount(interestamount);
		
		// use DAo
		int count =dao.insert(bo);
		
		//terinary operator <condition>?"success":"failure"
		return count >=1?"customer registered succesfully...>simpleinterest amount:::"+interestamount:"Customer registration failed";  
		
	}

}
