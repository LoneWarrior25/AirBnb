package com.AirBnB.entity;

import org.hibernate.type.descriptor.sql.internal.CapacityDependentDdlType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
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
