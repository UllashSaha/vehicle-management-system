package com.saha.vehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saha.vehicleManagement.models.Vehicle;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
