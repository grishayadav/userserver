package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dao.UserDAO;
import com.model.User;



@RestControllerAdvice
@RequestMapping(value = "/User")
public class UserController {
	@Autowired	
UserDAO userdao;
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public User saveuser(@RequestBody User ud)
	{
		userdao.save(ud);
		return ud;///
	}

}


