package com.niit.test;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierTest 
{
    public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
        
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		Supplier supplier=new Supplier();
		supplier.setSupplierId(1);
		supplier.setSupplierName("Suji");
		supplier.setSupplierLocation("Chennai");
		
		supplierDAO.addSupplier(supplier);
	}
}
