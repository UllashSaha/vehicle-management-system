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
import com.saha.vehicleManagement.models.VehicleStatus;
import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.services.CountryService;
import com.saha.vehicleManagement.services.VehicleStatusService;
import com.saha.vehicleManagement.services.StateService;

@Controller
public class VehicleStatusController {
	
	@Autowired private VehicleStatusService vehicleStatusService;

	
	@GetMapping("/vehicleStatuses")
	public String getVehicleStatus(Model model) {
		
		List<VehicleStatus> vehicleStatusList=vehicleStatusService.getVehicleStatuses();
		model.addAttribute("vehicleStatuses", vehicleStatusList);
		
     
		
		return "vehicleStatus";
	}
	
	@PostMapping("/vehicleStatuses/addNew")
	public String addVehicleStatus(VehicleStatus vehicleStatus) {
		
		vehicleStatusService.save(vehicleStatus);
		
		return "redirect:/vehicleStatuses";
		
	}
	
	@RequestMapping("/vehicleStatuses/findById")
	@ResponseBody
	public Optional<VehicleStatus> findById(int id){
		return vehicleStatusService.findById(id);
	}
	
	@RequestMapping(value="/vehicleStatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleStatus vehicleStatus) {
		vehicleStatusService.save(vehicleStatus);
		return "redirect:/vehicleStatuses";
	}
	
	@RequestMapping(value="/vehicleStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleStatusService.delete(id);
		return "redirect:/vehicleStatuses";
	}
}
