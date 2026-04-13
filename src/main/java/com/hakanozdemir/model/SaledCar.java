package com.hakanozdemir.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "saled_car", uniqueConstraints = {@UniqueConstraint(columnNames = {"gallerist_id","car_id","customer_id"},name = "uq_gallerist_car_customer")})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaledCar extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "gallerist_id")
    private Gallerist gallerist;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
