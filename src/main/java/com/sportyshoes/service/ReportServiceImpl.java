package com.sportyshoes.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private ReportRepository reportRepository;
	
	@Override
	@Transactional
	public List<Object[]> getListItemsSold() {
		return reportRepository.getReportList();
	}

	@Override
	@Transactional
	public List<Object[]> getListItemsSold(String date) {
		return reportRepository.getReportList(date);
	}

	@Override
	@Transactional
	public List<Object[]> getReportList(String toDate, String fromDate) {
		return reportRepository.getReportList(toDate, fromDate);
	}

	@Override
	@Transactional
	public List<Object[]> getListItemsSoldByCategory(String category) {
		return reportRepository.getListItemsSoldByCategory(category);
	}

	@Override
	@Transactional
	public List<Object[]> getListItemsSoldByCategory(String toDate, String category) {

		return reportRepository.getListItemsSoldByCategory(toDate, category);
	}

	@Override
	@Transactional
	public List<Object[]> getListItemsSoldByCategory(String toDate, String fromDate, String category) {
		return reportRepository.getListItemsSoldByCategory(toDate, fromDate, category);
	}


}
