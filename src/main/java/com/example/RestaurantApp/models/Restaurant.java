package com.example.RestaurantApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_restaurant")
    private long id_restaurant;
    @Column(name = "name_restaurant", length = 100, nullable = false)
    private String name;
    @Column(name = "address_restaurant", length = 100, nullable = false)
    private String address;
    @Column(name = "phone_restaurant", length = 100, nullable = false)
    private String phone;
    @Column(name = "category_restaurant", length = 100, nullable = false)
    private String category;

    public Restaurant() {
    }

    public Restaurant(long id_restaurant, String name, String address, String phone, String category) {
        this.id_restaurant = id_restaurant;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.category = category;
    }

    public long getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(long id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
