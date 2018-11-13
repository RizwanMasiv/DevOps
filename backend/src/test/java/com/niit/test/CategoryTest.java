package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
        
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		Category category=new Category();
		category.setCategoryId(1);
		category.setCategoryName("Samsung Galaxy S8+ 128GB");
		category.setCategoryDesc("4G Mobile, Iris Scanner,6GB RAM. 128GB internal storage, 12 megapixel back camera, 8 megapixel front camera.");
		
		categoryDAO.addCategory(category);
}
}
