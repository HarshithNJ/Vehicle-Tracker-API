package org.vehicle_tracker.vehicle_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.vehicle_tracker.vehicle_tracker.service.vehicleService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Vehicle Tracker", description = "Vehicle Tracker API")
public class vehicleController {

    @Autowired
    vehicleService service;
    
}
