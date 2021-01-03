package com.saha.vehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saha.vehicleManagement.models.JobTitle;
import com.saha.vehicleManagement.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	@Autowired
	private JobTitleRepository jobTitleRespository;
	
	public List<JobTitle> getJobTitles(){
		return jobTitleRespository.findAll();
	}
	
	public void save(JobTitle jobTitle) {
		jobTitleRespository.save(jobTitle);
	}
	
	
	public Optional<JobTitle> findById(int id) {
		return jobTitleRespository.findById(id);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		jobTitleRespository.deleteById(id);
		
	}
}
