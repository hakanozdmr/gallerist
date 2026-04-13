package com.hakanozdemir.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gallerist")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallerist extends BaseEntity {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
