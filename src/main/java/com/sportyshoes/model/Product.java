package com.sportyshoes.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="category")
	private String category;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="size")
	private Float size;
	
	@Column(name="price")
	private Float price;
	
	@Column(name="qty")
	private Integer qty;

	@OneToMany(mappedBy="product")
	private List<LineOrderItem> lineItems = new ArrayList<LineOrderItem>();
	
	public Product() {
		super();
	}

	public Product(String name, String gender, String category, String brand, Float size, Float price, Integer qty) {
		super();
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getId() {
		return id;
	}
	

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, gender=%s, style=%s, brand=%s, size=%s, price=%s qty=%s]", id, name,
				gender, category, brand, size, price, qty);
	}
	
	
	
}
