package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.OrderDetail;

@Repository("orderDetailDAO")
public class OrderDetailDAOImpl implements OrderDetailDAO 
{
	@Autowired
   	SessionFactory sessionFactory;
    
	@Transactional
	//@Override

	public boolean ConfirmOrderDetail(OrderDetail OrderDetail) 
	{
	
		try
		{
			sessionFactory.getCurrentSession().save(OrderDetail);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
