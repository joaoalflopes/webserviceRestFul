package com.jboyCorp.webserviceRestFul.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_address")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String place;
	private String numberPlace;
	private String addressComplement;
	private String neightBorHood;
	private String zipCode;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	public Address() {
	}

	public Address(Integer id, String place, String numberPlace, String addressComplement, String neightBorHood,
			String zipCode, Client client, City city) {
		super();
		this.id = id;
		this.place = place;
		this.numberPlace = numberPlace;
		this.addressComplement = addressComplement;
		this.neightBorHood = neightBorHood;
		this.zipCode = zipCode;
		this.client = client;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getNumberPlace() {
		return numberPlace;
	}

	public void setNumberPlace(String numberPlace) {
		this.numberPlace = numberPlace;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getNeightBorHood() {
		return neightBorHood;
	}

	public void setNeightBorHood(String neightBorHood) {
		this.neightBorHood = neightBorHood;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public City getCity() {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
