package com.car.rental.system.collections;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "cars")
public class Car {

    private String carId;
    private String brand;
    private String model;
    private String year;
    private String status;
    private RentalDetail rentalDetail;

}
