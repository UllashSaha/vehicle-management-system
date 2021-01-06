package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.VehicleStatus;
import com.saha.vehicleManagement.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	@Autowired
	private VehicleStatusRepository vehicleStatusRespository;
	
	public List<VehicleStatus> getVehicleStatuses(){
		return vehicleStatusRespository.findAll();
	}
	
	public void save(VehicleStatus vehicleStatus) {
		vehicleStatusRespository.save(vehicleStatus);
	}
	
	
	public Optional<VehicleStatus> findById(int id) {
		return vehicleStatusRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		vehicleStatusRespository.deleteById(id);
		
	}
}
