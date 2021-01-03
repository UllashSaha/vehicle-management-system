package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.EmployeeType;
import com.saha.vehicleManagement.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	@Autowired
	private EmployeeTypeRepository employeeTypeRespository;
	
	public List<EmployeeType> getEmployeeTypes(){
		return employeeTypeRespository.findAll();
	}
	
	public void save(EmployeeType employeeType) {
		employeeTypeRespository.save(employeeType);
	}
	
	
	public Optional<EmployeeType> findById(int id) {
		return employeeTypeRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		employeeTypeRespository.deleteById(id);
		
	}
}
