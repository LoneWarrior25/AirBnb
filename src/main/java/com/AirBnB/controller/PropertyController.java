package com.AirBnB.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AirBnB.dto.PropertyDto;
import com.AirBnB.entity.Property;
import com.AirBnB.repositories.PropertyRepo;
import com.AirBnB.services.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {
	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private PropertyService propertyService;

	@PostMapping("/post")
	public ResponseEntity<?> saveProperty(@RequestBody PropertyDto propertyDto) {

		PropertyDto savedProperty = this.propertyService.save(propertyDto);

		return new ResponseEntity(savedProperty, HttpStatus.CREATED);
	}

	@GetMapping("/getProperty/{id}")
	public ResponseEntity<?> getProperty(@PathVariable Integer id) {

		PropertyDto property = this.propertyService.getSingleProperty(id);

		return new ResponseEntity(property, HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllProperties(){
		
		List<PropertyDto> allProperty = this.propertyService.getAllProperty();
		
		return new ResponseEntity(allProperty,HttpStatus.OK);
	}
	
//	@GetMapping("/propertyResult")
//	public List<Property> searchPropertyName(@RequestParam("cityName") String cityName) {
//		
//	  
//	   
//	   List<Property> property = this.propertyService.searchProperty(cityName);
//		
//		return property;
//		
//	}
	
	@GetMapping("/propertyResult")
	public List<PropertyDto> searchPropertyName(@RequestParam("cityName") String cityName) {
		
	  
	   
	   List<PropertyDto> property = this.propertyService.searchProperty(cityName);
		
		return property;
		
	}
}
