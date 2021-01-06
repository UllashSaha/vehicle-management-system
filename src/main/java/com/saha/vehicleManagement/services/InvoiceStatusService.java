package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.InvoiceStatus;
import com.saha.vehicleManagement.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	@Autowired
	private InvoiceStatusRepository invoiceStausRespository;
	
	public List<InvoiceStatus> getInvoiceStatuses(){
		return invoiceStausRespository.findAll();
	}
	
	public void save(InvoiceStatus invoiceStaus) {
		invoiceStausRespository.save(invoiceStaus);
	}
	
	
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStausRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		invoiceStausRespository.deleteById(id);
		
	}
}
