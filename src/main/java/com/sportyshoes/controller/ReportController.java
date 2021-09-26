package com.sportyshoes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sportyshoes.service.ReportService;

@Controller
@RequestMapping("/report")
public class ReportController {
	
	@Autowired 
	private ReportService reportService;
	
	@GetMapping("/list")
	public String showReportList(Model model, String fromDate, String toDate, String category) {
		if(fromDate == null)
			fromDate="";
		if(toDate == null)
			toDate ="";
		if(category == null)
			category = "";
		
		//Category field is empty
		if(category.isBlank()) {
			if(fromDate.isEmpty() && toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSold());
			else if(fromDate.isEmpty() && !toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSold(toDate));
			else if(!fromDate.isEmpty() && toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSold(fromDate));
			else
				model.addAttribute("report",reportService.getReportList(fromDate, toDate));
		}else {
			if(fromDate.isEmpty() && toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSoldByCategory(category));
			else if(fromDate.isEmpty() && !toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSoldByCategory(toDate, category));
			else if(!fromDate.isEmpty() && toDate.isEmpty())
				model.addAttribute("report", reportService.getListItemsSoldByCategory(fromDate,category));
			else
				model.addAttribute("report",reportService.getListItemsSoldByCategory(fromDate, toDate,category));
		}
			
			model.addAttribute("toDate", toDate);
			model.addAttribute("fromDate", fromDate);
			model.addAttribute("category", category);
			
		return "report-list";
	}
	
	
	

}
