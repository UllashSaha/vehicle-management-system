package com.saha.vehicleManagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	@GetMapping("/invoiceStatuses")
	public String getInvoiceStatus() {
		return "invoiceStatus";
	}
}
