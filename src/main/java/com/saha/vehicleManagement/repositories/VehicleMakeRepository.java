package com.saha.vehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saha.vehicleManagement.models.VehicleMake;


@Repository
public interface VehicleMakeRepository extends JpaRepository<VehicleMake, Integer> {

}
