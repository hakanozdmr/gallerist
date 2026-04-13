package com.hakanozdemir.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gallerist_car", uniqueConstraints = {@UniqueConstraint(columnNames = {"gallerist_id","car_id"},name = "uq_gallerist_car")})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GalleristCar extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "gallerist_id")
    private Gallerist gallerist;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
