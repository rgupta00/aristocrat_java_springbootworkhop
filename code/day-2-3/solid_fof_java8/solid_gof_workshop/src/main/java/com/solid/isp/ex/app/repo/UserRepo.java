package com.solid.isp.ex.app.repo;

import com.solid.isp.ex.app.entity.User;

import java.util.List;


public class UserRepo implements CrudRepository<User>{

	@Override
	public void save(User entity) {
		//make a sence
	}

	@Override
	public void delete(User entity) {
		//make a sence
	}

	@Override
	public User findById(Long id) {
		//make a sence
		return null;
	}

	@Override
	public List<User> findByName(String name) {
		 //make a sence
		return null;
	}

}
