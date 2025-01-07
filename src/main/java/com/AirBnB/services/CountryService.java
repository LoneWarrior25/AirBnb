package com.AirBnB.services;

import java.util.List;

import com.AirBnB.dto.CountryDto;

public interface CountryService {

	public CountryDto saveCountry(CountryDto countryDto);
	
	public List<CountryDto> getAllCountries();
}
