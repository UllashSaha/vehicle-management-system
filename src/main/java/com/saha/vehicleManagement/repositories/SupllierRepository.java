package com.saha.vehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saha.vehicleManagement.models.Supplier;

@Repository
public interface SupllierRepository extends JpaRepository<Supplier, Integer> {

}
