package com.sportyshoes.service;

import java.util.List;

public interface ReportService {

	public List<Object[]> getListItemsSold();
	public List<Object[]> getListItemsSold(String date);
	public List<Object[]> getReportList(String toDate, String fromDate);
	public List<Object[]> getListItemsSoldByCategory(String category);
	public List<Object[]> getListItemsSoldByCategory(String toDate, String category);
	public List<Object[]> getListItemsSoldByCategory( String toDate, String fromDate, String category);
}
