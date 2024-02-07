package com.car.rental.system.collections;

import lombok.Data;

@Data
public class RentalDetail {

    private String rentalId;
    private String customerId;
    private Data startDate;
    private Data endDate;
    private Double totalAmount;
}
