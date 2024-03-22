package com.ms.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ms.Bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO
{
	private static final String REALTIME_CUSTOMER_INSERT_QUERY="INSERT INTO REALTIME_CUSTOMER VALUES(CUSTID_SEQ.NEXTVAL,?,?,?,?,?,?)"; 
	private DataSource ds;
	
	
	public CustomerDAOImpl(DataSource ds) 
	{
		super();
		System.out.println("CustomerDAo implements:: 1-param constructor");
		this.ds = ds;
	}


	@Override
	public int insert(CustomerBO bo) throws Exception 
	{
		Connection con =null;
		PreparedStatement ps =null;
		int count=0;
		try
		{
			//get pooled jdbc con object
			con=ds.getConnection();
			//Create PreparedStatement Object having pre-compiled SQL Query
			ps=con.prepareStatement(REALTIME_CUSTOMER_INSERT_QUERY);
			
			//set Query param values
			ps.setString(1,bo.getCustname());
			ps.setString(2,bo.getCustaddrs());
			ps.setFloat(3,bo.getPrincipleamount());
			ps.setFloat(4,bo.getRateofinterset());
			ps.setFloat(5,bo.getTimeofintersert());
			ps.setFloat(6,bo.getIntrestamount());

			// Excute the Query
			count=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			try
			{
				if(ps!=null)
				{
					ps.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		return count;
	}
}
