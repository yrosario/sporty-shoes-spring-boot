package com.sportyshoes.repository;

import java.util.List;


public interface ReportRepository {
	
	public List<Object[]> getReportList();
	
	public List<Object[]> getReportList(String date);
	
	public List<Object[]> getReportList(String toDate, String fromDate);
	
	public List<Object[]> getListItemsSoldByCategory(String category);
	
	public List<Object[]> getListItemsSoldByCategory(String toDate, String category);
	
	public List<Object[]> getListItemsSoldByCategory( String toDate, String fromDate, String category);
}
