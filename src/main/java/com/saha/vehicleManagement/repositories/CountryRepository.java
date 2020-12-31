package com.saha.vehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saha.vehicleManagement.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
