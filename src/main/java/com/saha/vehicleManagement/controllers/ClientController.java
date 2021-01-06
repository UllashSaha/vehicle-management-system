package com.saha.vehicleManagement.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saha.vehicleManagement.models.Country;
import com.saha.vehicleManagement.models.Client;
import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.services.CountryService;
import com.saha.vehicleManagement.services.ClientService;
import com.saha.vehicleManagement.services.StateService;

@Controller
public class ClientController {

	@Autowired private ClientService clientService;
	@Autowired private CountryService countryService;
	@Autowired private StateService stateService;
	
	@GetMapping("/clients")
	public String getClient(Model model) {
		
		List<Client> clientList=clientService.getClients();
		model.addAttribute("clients", clientList);
		
        List<Country> countryList=countryService.getCountries();
		model.addAttribute("countries", countryList);
		
        List<State> stateList=stateService.getStates();
		model.addAttribute("states", stateList);
		
		return "client";
	}
	
	@PostMapping("/clients/addNew")
	public String addClient(Client client) {
		
		clientService.save(client);
		
		return "redirect:/clients";
		
	}
	
	@RequestMapping("/clients/findById")
	@ResponseBody
	public Optional<Client> findById(int id){
		return clientService.findById(id);
	}
	
	@RequestMapping(value="/clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		clientService.save(client);
		return "redirect:/clients";
	}
	
	@RequestMapping(value="/clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}
}
