package com.app.repo;

import java.util.List;

import com.app.entity.User;

public class UserRepo implements CrudRepository<User>, FindByNameRepository<User>{

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
