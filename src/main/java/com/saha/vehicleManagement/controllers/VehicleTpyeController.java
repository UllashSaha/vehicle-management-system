package com.saha.vehicleManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTpyeController {
	@GetMapping("/vehicleTypes")
	public String getVehicleType() {
		return "vehicleType";
	}
}
