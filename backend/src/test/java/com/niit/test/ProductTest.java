package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductTest
{
public static void main(String arg[])
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
	Product product=new Product();
	product.setCategoryId(1);
	product.setProductId(101);
	product.setSupplierId(123);
	product.setProductName("Samsung Mobile");
	product.setProductDesc("4G Mobile");
	product.setPrice(15000);
	product.setStock(50);
	
	productDAO.addProduct(product);
}

}
