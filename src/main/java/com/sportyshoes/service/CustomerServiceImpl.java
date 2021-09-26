package com.sportyshoes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Customer;
import com.sportyshoes.repository.GenericRepository;

@Service
public class CustomerServiceImpl implements GenericService<Customer> {

	@Autowired GenericRepository<Customer> customerRepository;
	
	@Override
	@Transactional
	public List<Customer> getList() {
		return customerRepository.getList();
	}

	@Override
	@Transactional
	public Customer getById(Integer id) {
		return customerRepository.getById(id);
	}

	@Override
	@Transactional
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		customerRepository.deleteById(id);
	}

	@Override
	public List<Customer> findByKeyword(String keyword) {
		return customerRepository.findByKeyword(keyword);
	}

}
