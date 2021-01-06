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

import com.saha.vehicleManagement.models.Invoice;
import com.saha.vehicleManagement.models.InvoiceStatus;
import com.saha.vehicleManagement.models.Client;

import com.saha.vehicleManagement.services.InvoiceService;
import com.saha.vehicleManagement.services.InvoiceStatusService;
import com.saha.vehicleManagement.services.ClientService;


@Controller
public class InvoiceController {
	@Autowired private InvoiceStatusService invoiceStatusService;
	@Autowired private ClientService clientService;
	@Autowired private InvoiceService invoiceService;
	
	@GetMapping("/invoices")
	public String getInvoice(Model model) {
		
		List<InvoiceStatus> invoiceStatusList=invoiceStatusService.getInvoiceStatuses();
		model.addAttribute("invoiceStatuses", invoiceStatusList);
		
        List<Client> clientList=clientService.getClients();
		model.addAttribute("clients", clientList);
		
        List<Invoice> invoiceList= invoiceService.getInvoices();
		model.addAttribute("invoices", invoiceList);
		
		return "invoice";
	}
	
	@PostMapping("/invoices/addNew")
	public String addInvoice(Invoice invoice) {
		
		invoiceService.save(invoice);
		
		return "redirect:/invoices";
		
	}
	
	@RequestMapping("/invoices/findById")
	@ResponseBody
	public Optional<Invoice> findById(int id){
		return invoiceService.findById(id);
	}
	
	@RequestMapping(value="/invoices/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	@RequestMapping(value="/invoices/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceService.delete(id);
		return "redirect:/invoices";
	}
}
