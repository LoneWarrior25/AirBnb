package com.AirBnB.dto;

import com.AirBnB.entity.City;
import com.AirBnB.entity.Country;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDto {

private String name;
	
	private String number_of_guests;
	
	private String number_of_bedrooms;
	
	private String number_of_beds;
	
	private String number_of_bathrooms;
	
	@ManyToOne
	private Country country;
	
	@ManyToOne
	private City city;
}
