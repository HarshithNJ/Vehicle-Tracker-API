package org.vehicle_tracker.vehicle_tracker.dto;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private long vehicleID;
    private String make;
    private String model;

    @DateTimeFormat(pattern = "yyyy")
    private String year;
    private String status;
    
}
