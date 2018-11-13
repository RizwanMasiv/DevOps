package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Category 
{
  @Id 
  @GeneratedValue
  public int categoryId;
  private  String categoryName;
  private String categoryDesc;

  public int getCategoryId() 
  {
	return categoryId;
}
public void setCategoryId(int categoryId)
{
	this.categoryId = categoryId;
}
public String getCategoryName() 
{
	return categoryName;
}
public void setCategoryName(String categoryName) 
{
	this.categoryName = categoryName;
}
public String getCategoryDesc() 
{
	return categoryDesc;
}
public void setCategoryDesc(String categoryDesc) 
{
	this.categoryDesc = categoryDesc;
}
  
}