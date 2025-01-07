package com.AirBnB.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirBnB.dto.PropertyDto;
import com.AirBnB.entity.Property;
import com.AirBnB.repositories.PropertyRepo;
import com.AirBnB.services.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{
	
	@Autowired
	private PropertyRepo propertyRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PropertyDto save(PropertyDto prpertyDto) {
		
		Property map = this.modelMapper.map(prpertyDto, Property.class);
		
		
		Property savedProperty = this.propertyRepo.save(map);
		
		return modelMapper.map(savedProperty, PropertyDto.class);
	}

	@Override
	public PropertyDto getSingleProperty(Integer id) {
		
		Optional<Property> findbyId = this.propertyRepo.findById(id);
		
		Property property = findbyId.get();
		
		return modelMapper.map(property, PropertyDto.class);
	}

	@Override
	public List<PropertyDto> getAllProperty() {
		
		List<Property> allProperties = this.propertyRepo.findAll();
		
		List<PropertyDto> properties = allProperties.stream().map((allProperty)->this.modelMapper.map(allProperty, PropertyDto.class)).collect(Collectors.toList()); 
		
		return properties;
	}

}
