package com.sportyshoes.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReportRepositoryImpl implements ReportRepository {

	@Autowired
	private EntityManager em;
	
	@Override
	public List<Object[]> getReportList() {
		
		//Get the inner of Product and LineOrderItem
		Query query = em.createQuery("SELECT p, l.purchasedDate as purchasedDate FROM Product p JOIN p.lineItems l");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();
		
		for(Object[] o:resultList)
			System.out.println("Current Values " + o[1]);

		
		return resultList;
	}

	@Override
	public List<Object[]> getReportList(String date) {
		
		//Get the inner of Product and LineOrderItem
		Query query = em.createQuery("SELECT p, l.purchasedDate as purchasedDate FROM Product p JOIN p.lineItems l WHERE DATE(l.purchasedDate) = '" + date + "'");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();

		return resultList;
		
	}

	@Override
	public List<Object[]> getReportList(String toDate, String fromDate) {
		//Get the inner of Product and LineOrderItem
		Query query = 
				em.createQuery("SELECT p, l.purchasedDate as purchasedDate "
						+ "FROM Product p JOIN p.lineItems l WHERE l.purchasedDate BETWEEN '" + toDate + "' AND '" + fromDate + "'");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public List<Object[]> getListItemsSoldByCategory(String category) {
		//Get the inner of Product and LineOrderItem
		Query query = em.createQuery("SELECT p, l.purchasedDate as purchasedDate FROM Product p JOIN p.lineItems l WHERE p.category = '" + category + "'");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public List<Object[]> getListItemsSoldByCategory(String toDate, String category) {
		//Get the inner of Product and LineOrderItem
		Query query = em.createQuery("SELECT p, l.purchasedDate as purchasedDate FROM Product p JOIN p.lineItems l "
				+ "WHERE DATE(l.purchasedDate) = '" + toDate + "' AND p.category = '" + category + "'");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public List<Object[]> getListItemsSoldByCategory(String toDate, String fromDate, String category) {
		//Get the inner of Product and LineOrderItem
		Query query = 
				em.createQuery("SELECT p, l.purchasedDate as purchasedDate "
						+ "FROM Product p JOIN p.lineItems l WHERE l.purchasedDate BETWEEN '" + toDate + "' AND '" + fromDate + "' AND p.category = '" + category + "'");
		
		//Results of query returns a list of array Object
		@SuppressWarnings("unchecked")
		List<Object[]> resultList = query.getResultList();

		return resultList;
	}
	
	
	


}
