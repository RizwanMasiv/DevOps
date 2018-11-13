
package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Com 
{
	@RequestMapping("/")
public String Home()
{
	return "index";
}
	@RequestMapping("/contactus")
	public String Home2()
	{
		return "Contactus";
	}
	@RequestMapping("/aboutus")
	public String Home3()
	{
		return "Aboutus";
	}
	@RequestMapping("/login")
	public String Home4(HttpSession Session)
	{
		return "login";
	}

	@RequestMapping("/register")
	public String showregister()
	{
		return "register";
	}
	@RequestMapping("/ah")
	public String Home6()
	{
		return "adminhome";
	}
	@RequestMapping("/cart")
	public String Home7()
	{
		return "cart";
	}
	
	@RequestMapping("/ip")
	public String Home8()
	{
		return "insertingproduct";
	}
	
}

