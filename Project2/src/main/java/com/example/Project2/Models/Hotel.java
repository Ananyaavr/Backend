package com.example.Project2.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Hotel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int phone_no;
	private String name;
	private int total_mem;
	private int checkin;
	private int checkout;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(int id, int phone_no, String name, int total_mem, int checkin, int checkout) {
		super();
		this.id = id;
		this.phone_no = phone_no;
		this.name = name;
		this.total_mem = total_mem;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_mem() {
		return total_mem;
	}
	public void setTotal_mem(int total_mem) {
		this.total_mem = total_mem;
	}
	public int getCheckin() {
		return checkin;
	}
	public void setCheckin(int checkin) {
		this.checkin = checkin;
	}
	public int getCheckout() {
		return checkout;
	}
	public void setCheckout(int checkout) {
		this.checkout = checkout;
	}
	
	
	
}
