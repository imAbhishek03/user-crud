package com.crud.service;

import java.util.List;

import com.crud.entity.User;

public interface UserService {

	public List<User> getUsers();
	
	public User addUser(User user);

	public User getUser(Long id);
}
