package com.jboyCorp.webserviceRestFul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jboyCorp.webserviceRestFul.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
