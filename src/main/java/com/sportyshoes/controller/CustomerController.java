package com.sportyshoes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sportyshoes.model.Customer;
import com.sportyshoes.service.GenericService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private GenericService<Customer> customerService;
	
	@GetMapping("/list")
	public String getCustomerList(Model model, String keyword) {
		System.out.println("value of keyword" + keyword);

		if(keyword != null) {
			model.addAttribute("customers", customerService.findByKeyword(keyword) );
		}else {
			model.addAttribute("customers", customerService.getList());
		}
		
		model.addAttribute("keyword", keyword);
		
		return "customer-list";
				
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustmer(@ModelAttribute("customer") Customer customer) {
		
		customerService.save(customer);
		
		
		return "redirect:/customer/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
		
		//Retrieve customer from customer repository by id
		Customer customer = customerService.getById(id);
		
		
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@GetMapping("delete")
	public String deleteCustomer(@RequestParam("customerId") int id) {
		
		customerService.deleteById(id);
		
		return "redirect:/customer/list";
	}

}
