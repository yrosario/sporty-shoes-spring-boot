package com.sportyshoes.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "receipt")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="cost")
	private Float cost;
	
	@Column(name="shipping_address")
	private String shippingAddress;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="purchased_date")
	private LocalDate purchasedDate;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name="delivery_date")
	private LocalDate deliveryDate;

	@ManyToOne
	private Customer customer;

	@OneToMany(mappedBy = "order")
	private List<LineOrderItem> lineItems = new ArrayList<LineOrderItem>();

	public Order() {
		super();
	}

	public Order(Float cost, String shippingAddress, LocalDate purchaseDate, LocalDate deliveryDate) {
		super();
		this.cost = cost;
		this.shippingAddress = shippingAddress;
		this.purchasedDate = purchaseDate;
		this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<LineOrderItem> getLineItems() {
		return lineItems;
	}

	public void addtLineItem(LineOrderItem lineItem) {
		this.lineItems.add(lineItem);
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return String.format("Order [id=%s, cost=%s, shippingAddress=%s, purchasedDate=%s, deliveryDate=%s]", id, cost,
				shippingAddress, purchasedDate, deliveryDate);
	}

}
