package com.jboyCorp.webserviceRestFul.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jboyCorp.webserviceRestFul.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
