package com.sportyshoes.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface GenericService<T> {

	public List<T> getList();
	public List<T> findByKeyword(@Param("keyword") String keyword);
	public T getById(Integer id);
	public void save(T targetOb);
	public void deleteById(Integer id);
}
