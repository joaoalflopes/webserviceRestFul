package com.jboyCorp.webserviceRestFul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jboyCorp.webserviceRestFul.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	
}
