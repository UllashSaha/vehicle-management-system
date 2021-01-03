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
import com.saha.vehicleManagement.models.VehicleMake;
import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.services.CountryService;
import com.saha.vehicleManagement.services.VehicleMakeService;
import com.saha.vehicleManagement.services.StateService;

@Controller
public class VehicleMakeController {
	
	@Autowired private VehicleMakeService vehicleMakeService;
	
	@GetMapping("/vehicleMakes")
	public String getVehicleMake(Model model) {
		
		List<VehicleMake> vehicleMakeList=vehicleMakeService.getVehicleMakes();
		model.addAttribute("vehicleMakes", vehicleMakeList);
		
       
		return "vehicleMake";
	}
	
	@PostMapping("/vehicleMakes/addNew")
	public String addVehicleMake(VehicleMake vehicleMake) {
		
		vehicleMakeService.save(vehicleMake);
		
		return "redirect:/vehicleMakes";
		
	}
	
	@RequestMapping("/vehicleMakes/findById")
	@ResponseBody
	public Optional<VehicleMake> findById(int id){
		return vehicleMakeService.findById(id);
	}
	
	@RequestMapping(value="/vehicleMakes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleMake vehicleMake) {
		vehicleMakeService.save(vehicleMake);
		return "redirect:/vehicleMakes";
	}
	
	@RequestMapping(value="/vehicleMakes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleMakeService.delete(id);
		return "redirect:/vehicleMakes";
	}
}
