package com.sportyshoes.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sportyshoes.model.Product;

@Repository
public class ProductRepositoryImpl implements GenericRepository<Product> {
	
	@Autowired
	EntityManager em;

	@Override
	@Transactional
	public List<Product> getList() {
		Session currentSession = em.unwrap(Session.class);

		Query<Product> query = currentSession.createQuery("from Product", Product.class);

		List<Product> products = query.getResultList();

		return products;
	}

	@Override
	@Transactional
	public Product getById(Integer id) {
		Session currentSession = em.unwrap(Session.class);
		
		Product product = currentSession.get(Product.class, id);
		
		return product;
	}

	@Override
	@Transactional
	public void save(Product product) {
		Session currentSession = em.unwrap(Session.class);
		
		currentSession.saveOrUpdate(product);
		
	}

	@Override
	@Transactional
	public void deleteById(Integer id) {
		Session currentSession = em.unwrap(Session.class);
		
		@SuppressWarnings("rawtypes")
		Query query =
				currentSession.createQuery("delete from Product where id=:productId");
		query.setParameter("productId", id);
		
		query.executeUpdate();
	}

	@Override
	public List<Product> findByKeyword(String keyword) {
		//Get current hibernate session
		Session currentSession = em.unwrap(Session.class);
		
		//create a query
		Query<Product> query =
				currentSession.createQuery("from Product p where p.name like '%" +keyword+"%' or p.brand like '"+keyword+"%' or p.category like '"+keyword+"%'", Product.class);
		
		//execute query and get result list
		List<Product> products = query.getResultList();
		
		return products;
	}

}
