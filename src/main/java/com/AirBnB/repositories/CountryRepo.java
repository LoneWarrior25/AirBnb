package com.AirBnB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirBnB.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Integer>{

}
