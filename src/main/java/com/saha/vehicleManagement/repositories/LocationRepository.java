package com.saha.vehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saha.vehicleManagement.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
