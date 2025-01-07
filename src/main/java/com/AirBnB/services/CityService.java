package com.AirBnB.services;

import java.util.List;

import com.AirBnB.dto.CityDto;

public interface CityService {

	public CityDto saveCity(CityDto cityDto);
	
	public List<CityDto> getAllCities();
}
