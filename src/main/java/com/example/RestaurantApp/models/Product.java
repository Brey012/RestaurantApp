package com.example.RestaurantApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_product;
    private Long id_restaurant;

    @Column(name = "name_product", length = 100, nullable = false)
    private String name;
    @Column(name = "price_product", length = 100, nullable = false)
    private String price;
    @Column(name = "description_product", length = 100, nullable = false)
    private String description;

    public Product() {
    }

    public Product(Long id_product, Long id_restaurant, String name, String price, String description) {
        this.id_product = id_product;
        this.id_restaurant = id_restaurant;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public Long getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(Long id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
