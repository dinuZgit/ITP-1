package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignInController 
	{
		@RequestMapping("signin")
		public String SignIn() 
			{
				return "SignIn.jsp";
			}
	
	}
