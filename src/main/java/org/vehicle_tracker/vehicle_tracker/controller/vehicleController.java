package org.vehicle_tracker.vehicle_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.vehicle_tracker.vehicle_tracker.service.vehicleService;

@RestController
public class vehicleController {

    @Autowired
    vehicleService service;
    
}
