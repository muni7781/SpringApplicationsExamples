package com.ms.CONTROLLER;

import com.ms.DTO.CustomerDTO;
import com.ms.SERVICE.ICustomerMgmtService;
import com.ms.VO.CustomerVo;

public class MainController 
{
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) 
	{
		super();
		System.out.println("Main Controller: 1-param constructor");
		this.service = service;
	}
	
	public String processCustomer(CustomerVo vo) throws Exception
	{
		//convert vo class object to DTo class object data
		CustomerDTO dto = new CustomerDTO();
		dto.setCustaddrs(vo.getCustaddrs());
		dto.setCustname(vo.getCustname());
		dto.setPrincipleamount(Float.parseFloat(vo.getPrincipleamount()));
		dto.setRateofinterset(Float.parseFloat(vo.getRateofinterset()));
		dto.setTimeofintersert(Float.parseFloat(vo.getTimeofintersert()));
		//use service
		String result=service.calculateSimpleInterestAmount(dto);
		return result;
	}
	
}
