package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.repositories.StateRepository;

@Service
public class StateService {
	@Autowired
	private StateRepository stateRespository;
	
	public List<State> getStates(){
		return stateRespository.findAll();
	}
	
	public void save(State state) {
		stateRespository.save(state);
	}
	
	
	public Optional<State> findById(int id) {
		return stateRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		stateRespository.deleteById(id);
		
	}
}
