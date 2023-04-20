package com.joshguna.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Customer extends BaseEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String userName;

    //Not adding Balance to keep Customer as light as possible

    @OneToMany(mappedBy = "customer")
    private List<Address> addressList;

}
