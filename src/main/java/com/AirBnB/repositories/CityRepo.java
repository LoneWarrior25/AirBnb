package com.AirBnB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirBnB.entity.City;

public interface CityRepo extends JpaRepository<City, Integer>{

}
