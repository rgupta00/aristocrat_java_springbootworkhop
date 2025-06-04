package com.solid.isp.ex.app.repo;

import com.solid.isp.ex.app.entity.Entity;

import java.util.List;

//SOL ISP D
//common interface to be implemented by all persistence services. 
public interface CrudRepository<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);
	
	public List<T> findByName(String name) ;
	
}
