package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.VehicleMake;
import com.saha.vehicleManagement.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	@Autowired
	private VehicleMakeRepository vehicleMakeRespository;
	
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRespository.findAll();
	}
	
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRespository.save(vehicleMake);
	}
	
	
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		vehicleMakeRespository.deleteById(id);
		
	}
}
