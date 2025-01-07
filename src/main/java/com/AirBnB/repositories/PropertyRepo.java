package com.AirBnB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirBnB.entity.Property;

public interface PropertyRepo extends JpaRepository<Property, Integer>{

}
