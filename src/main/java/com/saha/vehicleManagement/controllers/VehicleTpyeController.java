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
import com.saha.vehicleManagement.models.VehicleType;
import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.services.CountryService;
import com.saha.vehicleManagement.services.VehicleTypeService;
import com.saha.vehicleManagement.services.StateService;

@Controller
public class VehicleTpyeController {
	
	@Autowired private VehicleTypeService vehicleTypeService;

	
	@GetMapping("/vehicleTypes")
	public String getVehicleType(Model model) {
		
		List<VehicleType> vehicleTypeList=vehicleTypeService.getVehicleTypes();
		model.addAttribute("vehicleTypes", vehicleTypeList);
		
 
		
		return "vehicleType";
	}
	
	@PostMapping("/vehicleTypes/addNew")
	public String addVehicleType(VehicleType vehicleType) {
		
		vehicleTypeService.save(vehicleType);
		
		return "redirect:/vehicleTypes";
		
	}
	
	@RequestMapping("/vehicleTypes/findById")
	@ResponseBody
	public Optional<VehicleType> findById(int id){
		return vehicleTypeService.findById(id);
	}
	
	@RequestMapping(value="/vehicleTypes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(VehicleType vehicleType) {
		vehicleTypeService.save(vehicleType);
		return "redirect:/vehicleTypes";
	}
	
	@RequestMapping(value="/vehicleTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleTypeService.delete(id);
		return "redirect:/vehicleTypes";
	}
}
