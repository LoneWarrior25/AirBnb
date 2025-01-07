package com.AirBnB.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.AirBnB.dto.PropertyDto;
import com.AirBnB.entity.Property;

public interface PropertyRepo extends JpaRepository<Property, Integer>{

	
	@Query("Select p from Property p JOIN City c on p.city.id=c.id where c.name=:cityName")
	List<Property> serachProperty(
			@Param("cityName") String cityName
			);
}
