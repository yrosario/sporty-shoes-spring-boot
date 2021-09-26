package com.sportyshoes.repository;

import java.util.List;


import org.springframework.data.repository.query.Param;

public interface GenericRepository<T> {
	
	public List<T> getList();
	public List<T> findByKeyword(@Param("keyword") String keyword);
	public T getById(Integer id);
	public void save(T targetObj);
	public void deleteById(Integer id);

}
