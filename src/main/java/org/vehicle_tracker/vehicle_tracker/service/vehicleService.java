package org.vehicle_tracker.vehicle_tracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vehicle_tracker.vehicle_tracker.repository.vehicleRepository;

@Service
public class vehicleService {

    @Autowired
    vehicleRepository repository;
    
}
