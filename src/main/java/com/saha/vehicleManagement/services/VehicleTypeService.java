package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.VehicleType;
import com.saha.vehicleManagement.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	@Autowired
	private VehicleTypeRepository vehicleTypeRespository;
	
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRespository.findAll();
	}
	
	public void save(VehicleType vehicleType) {
		vehicleTypeRespository.save(vehicleType);
	}
	
	
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		vehicleTypeRespository.deleteById(id);
		
	}
}
