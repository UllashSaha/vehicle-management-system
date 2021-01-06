package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.VehicleModel;
import com.saha.vehicleManagement.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	@Autowired
	private VehicleModelRepository vehicleModelRespository;
	
	public List<VehicleModel> getVehicleModels(){
		return vehicleModelRespository.findAll();
	}
	
	public void save(VehicleModel vehicleModel) {
		vehicleModelRespository.save(vehicleModel);
	}
	
	
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		vehicleModelRespository.deleteById(id);
		
	}
}
