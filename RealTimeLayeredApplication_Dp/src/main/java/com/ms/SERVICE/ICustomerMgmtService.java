package com.ms.SERVICE;

import com.ms.DTO.CustomerDTO;

public interface ICustomerMgmtService 
{
	public String calculateSimpleInterestAmount(CustomerDTO dto) throws Exception;

}
