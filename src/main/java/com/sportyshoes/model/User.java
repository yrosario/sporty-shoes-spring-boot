package com.sportyshoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private boolean active;
	
	private String password;
	
	private String roles;
	
	@Column(name="user_name")
	private String userName;

	public User() {
		super();
	}

	public User(boolean active, String password, String roles, String userName) {
		super();
		this.active = active;
		this.password = password;
		this.roles = roles;
		this.userName = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isactive() {
		return active;
	}

	public void setactive(boolean active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, active=%s, password=%s, roles=%s, userName=%s]", id, active, password,
				roles, userName);
	}
	
	
}
