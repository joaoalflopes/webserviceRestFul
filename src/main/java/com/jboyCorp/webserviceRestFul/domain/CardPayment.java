package com.jboyCorp.webserviceRestFul.domain;

import javax.persistence.Entity;

import com.jboyCorp.webserviceRestFul.domain.enums.PaymentStatus;

@Entity
public class CardPayment extends Payment {
	private static final long serialVersionUID = 1L;
	
	private Integer installments;
	
	public CardPayment() {
	}

	public CardPayment(Integer id, PaymentStatus status, Order order, Integer installments) {
		super(id, status, order);
		this.installments = installments;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}
}
