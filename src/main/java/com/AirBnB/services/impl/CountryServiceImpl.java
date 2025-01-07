package com.AirBnB.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirBnB.dto.CountryDto;
import com.AirBnB.entity.City;
import com.AirBnB.entity.Country;
import com.AirBnB.repositories.CityRepo;
import com.AirBnB.repositories.CountryRepo;
import com.AirBnB.services.CountryService;

@Service
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	@Override
	public CountryDto saveCountry(CountryDto countryDto) {
		
		Country country = this.modelmapper.map(countryRepo, Country.class);
		
		Country savedCountry = this.countryRepo.save(country);
		
		return this.modelmapper.map(savedCountry, CountryDto.class);
	}

	@Override
	public List<CountryDto> getAllCountries() {
		
		List<Country> allCountries = this.countryRepo.findAll();
		
		List<CountryDto> collect = allCountries.stream().map((countries)-> this.modelmapper.map(countries, CountryDto.class)).collect(Collectors.toList());
		
		return collect;
	}

	
}
