package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.Invoice;
import com.saha.vehicleManagement.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRespository;
	
	public List<Invoice> getInvoices(){
		return invoiceRespository.findAll();
	}
	
	public void save(Invoice invoice) {
		invoiceRespository.save(invoice);
	}
	
	
	public Optional<Invoice> findById(int id) {
		return invoiceRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		invoiceRespository.deleteById(id);
		
	}
}
