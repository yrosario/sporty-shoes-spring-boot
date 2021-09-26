package com.sportyshoes.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sportyshoes.model.Customer;

@Repository
public class CustomerRepositoryImpl implements GenericRepository<Customer> {

	//@Autowired
	//private SessionFactory sessionFactory;
	
	@Autowired
	EntityManager em;
	
	//set up constructor injection
	/*@Autowired
	public CustomerRepositoryImpl(EntityManager em) {
		this.em = em;
	}*/

	@Override
	public List<Customer> getList() {
		
		//Get current hibernate session
		Session currentSession = em.unwrap(Session.class);
		
		//create a query
		Query<Customer> query =
				currentSession.createQuery("from Customer", Customer.class);
		
		//execute query and get result list
		List<Customer> customers = query.getResultList();		
		//return the results
		
		return customers;
	}

	@Override
	public Customer getById(Integer id) {
		
		Session currentSession = em.unwrap(Session.class);
		
		Customer customer = currentSession.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public void save(Customer customer) {
		
		//Session currentSession = em.unwrap(Session.class);
		
		if(customer.getId() == null) {
			em.persist(customer);
			System.out.println("customer is null");
		}
		else {
		    em.merge(customer);
		    System.out.println("customer is not null");
		}

	}

	@Override
	public void deleteById(Integer id) {
		
		Session currentSession = em.unwrap(Session.class);
		
		@SuppressWarnings("unchecked")
		Query<Customer> query = 
				currentSession.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", id);
		
		query.executeUpdate();	
		

	}

	@Override
	public List<Customer> findByKeyword(String keyword) {
		//Get current hibernate session
		Session currentSession = em.unwrap(Session.class);
		
		//create a query
		Query<Customer> query =
				currentSession.createQuery("from Customer c where c.firstName like '" +keyword+"%' or c.lastName like '"+keyword+"%'", Customer.class);
		
		//execute query and get result list
		List<Customer> customers = query.getResultList();		
		//return the results
		
		for(Customer e : customers)
			System.out.println(e.toString());
		
		return customers;

	}

}
