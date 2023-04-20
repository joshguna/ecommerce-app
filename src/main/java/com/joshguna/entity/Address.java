package com.joshguna.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

}
