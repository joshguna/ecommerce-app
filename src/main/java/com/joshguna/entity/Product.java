package com.joshguna.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Product extends BaseEntity {

    private String name;
    private String price;
    private Integer quantity;
    private Integer remainingQuantity;

    //Categories can have Many Products
    //Product can have many Categories
    //We put JoinTable under Product
    //Because # of Products are higher than # of Categories
    @ManyToMany
    @JoinTable(
            name = "product_category_rel",
            joinColumns = @JoinColumn(name = "p_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Category> categoryList;

}
