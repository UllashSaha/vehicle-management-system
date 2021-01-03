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
import com.saha.vehicleManagement.models.InvoiceStatus;
import com.saha.vehicleManagement.models.State;
import com.saha.vehicleManagement.services.CountryService;
import com.saha.vehicleManagement.services.InvoiceStatusService;
import com.saha.vehicleManagement.services.StateService;

@Controller
public class InvoiceStatusController {
	
	@Autowired private InvoiceStatusService invoiceStatusService;
	
	
	@GetMapping("/invoiceStatuses")
	public String getInvoiceStatus(Model model) {
		
		List<InvoiceStatus> invoiceStatusList=invoiceStatusService.getInvoiceStatuses();
		model.addAttribute("invoiceStatuses", invoiceStatusList);
		
     
		
		return "invoiceStatus";
	}
	
	@PostMapping("/invoiceStatuses/addNew")
	public String addInvoiceStatus(InvoiceStatus invoiceStatus) {
		
		invoiceStatusService.save(invoiceStatus);
		
		return "redirect:/invoiceStatuses";
		
	}
	
	@RequestMapping("/invoiceStatuses/findById")
	@ResponseBody
	public Optional<InvoiceStatus> findById(int id){
		return invoiceStatusService.findById(id);
	}
	
	@RequestMapping(value="/invoiceStatuses/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(InvoiceStatus invoiceStatus) {
		invoiceStatusService.save(invoiceStatus);
		return "redirect:/invoiceStatuses";
	}
	
	@RequestMapping(value="/invoiceStatuses/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceStatusService.delete(id);
		return "redirect:/invoiceStatuses";
	}
}
