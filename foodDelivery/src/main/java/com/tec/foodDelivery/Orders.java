package com.tec.foodDelivery;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Orders 
{
	@Id
	private int orderId;
	private String item;
	private int cost;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="cust_id")
	private Customer customer;
	
	public Orders(int orderId, String item, int cost) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.cost = cost;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", item=" + item + ", cost=" + cost + ", customer=" + customer + "]";
	}
	
	
}
