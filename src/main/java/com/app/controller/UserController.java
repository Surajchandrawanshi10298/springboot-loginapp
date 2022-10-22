package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entity.User;
import com.app.repo.UserRepository;
@Controller
public class UserController 
{
	@Autowired
	private UserRepository repo;
	@GetMapping("/")
	public String login(Model model)
	{
		User user = new User();
		model.addAttribute("user", user);
		return "loginPage";
	}
	
	@PostMapping("/userlogin")
	public String userlog(@ModelAttribute("user") User user)
	{
		String userid = user.getUserId();
		User userdata = repo.findByUserId(userid);
		if(user.getPassword().equals(userdata.getPassword()))
		{
			return "home";
		}
		else
			return "error";
		
	}

}
