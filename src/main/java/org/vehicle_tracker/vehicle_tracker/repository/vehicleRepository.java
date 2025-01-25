package org.vehicle_tracker.vehicle_tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vehicle_tracker.vehicle_tracker.dto.vehicle;

public interface vehicleRepository extends JpaRepository<vehicle, Integer> {

    boolean existsByVehicleID(long vehicleID);

}
