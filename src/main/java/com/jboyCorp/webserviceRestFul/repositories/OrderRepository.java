package com.jboyCorp.webserviceRestFul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jboyCorp.webserviceRestFul.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
}
