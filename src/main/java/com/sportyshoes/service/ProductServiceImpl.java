package com.sportyshoes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Product;
import com.sportyshoes.repository.GenericRepository;

@Service
public class ProductServiceImpl implements GenericService<Product> {

	
	@Autowired GenericRepository<Product> productRepository;

	@Override
	@Transactional
	public List<Product> getList() {
		return productRepository.getList();
	}

	@Override
	@Transactional
	public Product getById(Integer id) {
		return productRepository.getById(id);
	}

	@Override
	@Transactional
	public void save(Product product) {
		productRepository.save(product);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public List<Product> findByKeyword(String keyword) {
		return productRepository.findByKeyword(keyword);
	}
}
