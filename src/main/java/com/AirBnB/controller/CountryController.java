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

import com.AirBnB.dto.CountryDto;
import com.AirBnB.services.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@PostMapping("/post")
	public ResponseEntity<?> saveCountry(@RequestBody CountryDto countryDto){
		
		CountryDto savedCountry = this.countryService.saveCountry(countryDto);
		
		return new ResponseEntity(savedCountry,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllCoutries(){
		
		List<CountryDto> allCountries = this.countryService.getAllCountries();
		
		return new ResponseEntity(allCountries,HttpStatus.OK);
	}
}
