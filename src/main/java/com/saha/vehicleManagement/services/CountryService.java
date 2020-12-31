package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.Country;
import com.saha.vehicleManagement.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRespository;
	
	public List<Country> getCountries(){
		return countryRespository.findAll();
	}
	
	public void save(Country country) {
		countryRespository.save(country);
	}
	
	
	public Optional<Country> findById(int id) {
		return countryRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		countryRespository.deleteById(id);
		
	}
}
