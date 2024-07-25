package com.balram.invoice.invoice_processing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String vendor ;
	private String product;
	private Integer amount;
	private String date;
	private String action;
	
	public Invoice(Integer id, String product, String vendor, Integer amount, String date, String action) {
		super();
		this.id = id;
		this.product = product;
		this.vendor = vendor;
		this.amount = amount;
		this.date = date;
		this.action = action;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", vendor=" + vendor + ", product=" + product + ", amount=" + amount + ", date="
				+ date + ", action=" + action + "]";
	}



	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}



}
