package com.jboyCorp.webserviceRestFul.domain;

import java.time.Instant;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jboyCorp.webserviceRestFul.domain.enums.PaymentStatus;

@Entity
public class BankPayment extends Payment {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant dueDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant payDay;
	
	public BankPayment() {
	}

	public BankPayment(Integer id, PaymentStatus status, Order order, Instant dueDate, Instant payDay) {
		super(id, status, order);
		this.dueDate = dueDate;
		this.payDay = payDay;
	}

	public Instant getDueDate() {
		return dueDate;
	}

	public void setDueDate(Instant dueDate) {
		this.dueDate = dueDate;
	}

	public Instant getPayDay() {
		return payDay;
	}

	public void setPayDay(Instant payDay) {
		this.payDay = payDay;
	}
}
