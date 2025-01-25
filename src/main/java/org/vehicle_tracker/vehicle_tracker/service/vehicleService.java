package org.vehicle_tracker.vehicle_tracker.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.vehicle_tracker.vehicle_tracker.dto.vehicle;
import org.vehicle_tracker.vehicle_tracker.repository.vehicleRepository;

@Service
public class vehicleService {

    @Autowired
    vehicleRepository repository;

    public ResponseEntity<Object> addVehicle(vehicle vehicle) {

        if(repository.existsByVehicleID(vehicle.getVehicleID())){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error","Vehicle Already Exists with the Vehicle ID : " + vehicle.getVehicleID());

            return new ResponseEntity<Object>(map, HttpStatus.NOT_ACCEPTABLE);
        }else{
            repository.save(vehicle);

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", "Vehicle Added Successfully");
            map.put("Data", vehicle);

            return new ResponseEntity<Object>(map, HttpStatus.CREATED);
        }
    }

    public ResponseEntity<Object> addMultipleVehicle(List<vehicle> vehicles) {
        for(vehicle vehicle : vehicles){
            if(repository.existsByVehicleID(vehicle.getVehicleID())){
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("error","Vehicle Already Exists");
    
                return new ResponseEntity<Object>(map, HttpStatus.NOT_ACCEPTABLE);
            }
        }
        repository.saveAll(vehicles);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", "Vehicle Added Successfully");
        map.put("Data", vehicles);

        return new ResponseEntity<Object>(map, HttpStatus.CREATED);
    }









    public ResponseEntity<Object> getAllVehicles() {
        List<vehicle> li = repository.findAll();

        if(li.isEmpty()){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("error","No Vehicles Found");

            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        }else{
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", "All Vehicles");
            map.put("Data", li);

            return new ResponseEntity<Object>(map, HttpStatus.FOUND);
        }
    }
    
}
