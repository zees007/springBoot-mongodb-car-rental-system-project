package com.car.rental.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CarRentalSystemApplication {

    @GetMapping("/ping")
    public String ping(){
        return "ping successfully...!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentalSystemApplication.class, args);
    }

}
