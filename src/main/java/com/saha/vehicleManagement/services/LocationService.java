package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.Location;
import com.saha.vehicleManagement.repositories.LocationRepository;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationRespository;
	
	public List<Location> getLocations(){
		return locationRespository.findAll();
	}
	
	public void save(Location location) {
		locationRespository.save(location);
	}
	
	
	public Optional<Location> findById(int id) {
		return locationRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		locationRespository.deleteById(id);
		
	}
}
