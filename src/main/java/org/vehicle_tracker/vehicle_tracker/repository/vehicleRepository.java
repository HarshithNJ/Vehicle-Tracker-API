package org.vehicle_tracker.vehicle_tracker.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vehicle_tracker.vehicle_tracker.dto.vehicle;

public interface vehicleRepository extends JpaRepository<vehicle, Integer> {

    boolean existsByVehicleID(long vehicleID);

    Optional<vehicle> findByVehicleID(long vehicleID);

    List<vehicle> findByModel(String model);

}
