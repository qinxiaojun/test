package com.smart.web;

import com.smart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController{
	private UserService userService;
    
	@RequestMapping(value = {"/","/index.html"})
	public ModelAndView loginPage(){
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/loginCheck.html")
	public ModelAndView loginCheck(HttpServletRequest request,LoginCommand loginCommand){
		boolean isValidUser =  userService.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());
		if (!isValidUser) {
			return new ModelAndView("login", "error", "用户名或密码错误。");
		}
		return new ModelAndView("main", "success", "登录成功。");
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
