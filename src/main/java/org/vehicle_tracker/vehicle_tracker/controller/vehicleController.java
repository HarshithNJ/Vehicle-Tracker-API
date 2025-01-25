package org.vehicle_tracker.vehicle_tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vehicle_tracker.vehicle_tracker.dto.vehicle;
import org.vehicle_tracker.vehicle_tracker.service.vehicleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Vehicle Tracker", description = "Vehicle Tracker API")
public class vehicleController {

    @Autowired
    vehicleService service;


    //To Create a new Vehicle Detail
    @Operation(summary = "Add a new vehicle Record", description = "To Create a new vehicle Record")
    @PostMapping("/vehicles")
    public ResponseEntity<Object> addVehicle(@RequestBody vehicle vehicle){
        return service.addVehicle(vehicle);
    }

    //To Get All Vehicle Details
    @Operation(summary = "Get All Vehicle Details", description = "To Get All Vehicle Details")
    @GetMapping("/vehicles")
    public ResponseEntity<Object> getAllVehicles(){
        return service.getAllVehicles();
    }
    
}
