package com.jboyCorp.webserviceRestFul.dto;

import java.io.Serializable;

import com.jboyCorp.webserviceRestFul.domain.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	//@NotEmpty(message = "Preenchimento Obrigatório!!")
	//@Length(min = 5, max = 60, message = "Exigencia minima de 5 e no maxímo 60 caracteres.")
	private String name;
	
	public CategoryDTO() {
	}
	
	public CategoryDTO(Category obj) {
		
		id = obj.getId();
		name = obj.getName();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
