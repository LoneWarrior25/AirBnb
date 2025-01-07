package com.AirBnB.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirBnB.dto.CityDto;
import com.AirBnB.entity.City;
import com.AirBnB.repositories.CityRepo;
import com.AirBnB.services.CityService;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public CityDto saveCity(CityDto cityDto) {
		
		City city = this.modelmapper.map(cityDto, City.class);
		
		City savedCity = this.cityRepo.save(city);
		
		return this.modelmapper.map(savedCity, CityDto.class);
	}

	@Override
	public List<CityDto> getAllCities() {
		
		List<City> allCity = this.cityRepo.findAll();
		
		List<CityDto> cityDtos = allCity.stream().map((allCities)-> this.modelmapper.map(allCities, CityDto.class)).collect(Collectors.toList());
		
		return cityDtos;
	}
	
	

}
