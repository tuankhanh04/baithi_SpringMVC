package com.class1.repository;

import com.class1.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vehiclerepository")
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
