package com.tec.foodDelivery;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer 
{	@Id
	private int cusId;
	private String name;
	@OneToMany(mappedBy = "customer",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Orders> orders;
	public Customer(int cusId, String name) {
		super();
		this.cusId = cusId;
		this.name = name;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(List<Orders> orders) {
		super();
		this.orders = orders;
	}
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", name=" + name + ", orders=" + orders + "]";
	}
	
}
