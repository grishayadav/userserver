package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.User;

public interface UserDAO  extends JpaRepository<User,Long>{
	
	User save(User user);

}
