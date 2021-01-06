package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.Client;
import com.saha.vehicleManagement.repositories.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRespository;
	
	public List<Client> getClients(){
		return clientRespository.findAll();
	}
	
	public void save(Client client) {
		clientRespository.save(client);
	}
	
	
	public Optional<Client> findById(int id) {
		return clientRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		clientRespository.deleteById(id);
		
	}
}
