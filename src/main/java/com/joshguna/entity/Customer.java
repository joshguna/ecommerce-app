package com.joshguna.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String userName;


}
