package com.AirBnB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirBnB.dto.CityDto;
import com.AirBnB.dto.CountryDto;
import com.AirBnB.services.CityService;

@RestController
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@PostMapping("/post")
	public ResponseEntity<?> saveCity(@RequestBody CityDto cityDto){
		
		CityDto savedCity = this.cityService.saveCity(cityDto);
		
		return new ResponseEntity(savedCity,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllCoutries(){
		
		List<CityDto> allCountries = this.cityService.getAllCities();
		
		return new ResponseEntity(allCountries,HttpStatus.OK);
	}

}
