package com.app.repo;

import java.util.List;

import com.app.entity.Entity;

public interface FindByNameRepository<T extends Entity> {
	public List<T> findByName(String name) ;
}
