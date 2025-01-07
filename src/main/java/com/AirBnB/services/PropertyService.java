package com.AirBnB.services;

import java.util.List;

import com.AirBnB.dto.PropertyDto;
import com.AirBnB.entity.Property;

public interface PropertyService {

	PropertyDto save(PropertyDto prpertyDto);
	
	PropertyDto getSingleProperty(Integer id);
	
	List<PropertyDto> getAllProperty();
	
//	List<Property> searchProperty(String cityname);
	
	List<PropertyDto> searchProperty(String cityname);
}
