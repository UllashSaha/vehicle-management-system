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
import com.saha.vehicleManagement.services.CountryService;


@Controller
public class CountryController {
   
	
	@Autowired
	private CountryService countryService;
	
	
	@GetMapping("/countries")
	public String getCountry(Model model) {
		
		List<Country> countryList=countryService.getCountries();
		
		model.addAttribute("countries", countryList);
		
		return "country";
	}
	
	@PostMapping("/countries/addNew")
	public String addCountry(Country country) {
		
		countryService.save(country);
		
		return "redirect:/countries";
		
	}
	
	@RequestMapping("/countries/findById")
	@ResponseBody
	public Optional<Country> findById(int id){
		return countryService.findById(id);
	}
	
	@RequestMapping(value="/countries/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="/countries/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
	
	
	
	
}
