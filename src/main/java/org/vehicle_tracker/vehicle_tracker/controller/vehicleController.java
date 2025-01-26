package org.vehicle_tracker.vehicle_tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.vehicle_tracker.vehicle_tracker.dto.vehicle;
import org.vehicle_tracker.vehicle_tracker.service.vehicleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Vehicle Tracker", description = "Vehicle Tracker API")
public class vehicleController {

    @Autowired
    vehicleService service;


    //To Create a new Vehicle Detail
    @Operation(summary = "Add a new vehicle Record", description = "To Create a new vehicle Record")
    @ApiResponse(responseCode = "201", description = "Vehicle Added Successfully")
    @ApiResponse(responseCode = "406", description = "Vehicle Already Exists with the Vehicle ID")
    @PostMapping("/vehicles")
    public ResponseEntity<Object> addVehicle(@RequestBody vehicle vehicle){
        return service.addVehicle(vehicle);
    }

    @Operation(summary = "Add Multiple Vehicle Records", description = "To Create Multiple vehicle Records")
    @ApiResponse(responseCode = "201", description = "Vehicle Added Successfully")
    @ApiResponse(responseCode = "406", description = "Vehicle Already Exists with the Vehicle ID")
    @PostMapping("/vehicles/multiple")
    public ResponseEntity<Object> addMultipleVehicle(@RequestBody List<vehicle> vehicles){
        return service.addMultipleVehicle(vehicles);
    }











    //To Get All Vehicle Details
    @Operation(summary = "Get All Vehicle Details", description = "To Get All Vehicle Details")
    @ApiResponse(responseCode = "302", description = "Vehicles Data Found")
    @ApiResponse(responseCode = "404", description = "No Vehicles Found")
    @GetMapping("/vehicles")
    public ResponseEntity<Object> getAllVehicles(){
        return service.getAllVehicles();
    }

    @Operation(summary = "Get Vehicle Details by Vehicle ID", description = "To Get Vehicle Details by Vehicle ID")
    @ApiResponse(responseCode = "302", description = "Vehicle Details Found")
    @ApiResponse(responseCode = "404", description = "Vehicle Not Found")
    @GetMapping("/vehicles/{vehicleID}")
    public ResponseEntity<Object> getVehicleByVehicleID(@PathVariable long vehicleID){
        return service.getVehicleByVehicleID(vehicleID);
    }

    @Operation(summary = "Get Vehicle Details By Model name", description = "To Get Vehicle Details By Model name")
    @ApiResponse(responseCode = "302", description = "Vehicle Details Found")
    @ApiResponse(responseCode = "404", description = "Vehicle Not Found")
    @GetMapping("/vehicles/model/{model}")
    public ResponseEntity<Object> getVehicleByModel(@PathVariable String model){
        return service.getVehicleByModel(model);
    }










    
    // To Delete Vehicle Details
    @Operation(summary = "Delete Vehicle Details by Vehicle ID", description = "To Delete Vehicle Details by Vehicle ID")
    @ApiResponse(responseCode = "200", description = "Vehicle Details Deleted Successfully")
    @ApiResponse(responseCode = "404", description = "Vehicle Not Found")
    @DeleteMapping("/vehicles/{vehicleID}")
    public ResponseEntity<Object> deleteById(@PathVariable Long vehicleID){
        return service.deleteById(vehicleID);
    }








    // To Update Vehicle Details
    @Operation(summary = "Update Vehicle Details by Vehicle ID", description = "To Update Vehicle Details by Vehicle ID")
    @ApiResponse(responseCode = "200", description = "Vehicle Details Updated Successfully")
    @ApiResponse(responseCode = "404", description = "Vehicle Not Found")
    @PatchMapping("/vehicles/{vehicleID}")
    public ResponseEntity<Object> updateVehicle(@PathVariable Long vehicleID, @RequestBody vehicle vehicle){
        return service.updateVehicle(vehicleID, vehicle);
    }
    
}
