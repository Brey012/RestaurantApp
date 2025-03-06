package com.example.RestaurantApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Deliveryman")
public class Deliveryman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_deliveryman;
    @Column(name = "name_deliveryman", length = 100, nullable = false)
    private String name;
    @Column(name = "phone_deliveryman", length = 100, nullable = false)
    private String phone;
    @Column(name = "email_deliveryman", length = 100, nullable = false)
    private String email;
    @Column(name = "vehicle_deliveryman", length = 100, nullable = false)
    private String vehicle;

    public Deliveryman() {
    }

    public Deliveryman(Long id_deliveryman, String name, String phone, String email, String vehicle) {
        this.id_deliveryman = id_deliveryman;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.vehicle = vehicle;
    }

    public Long getId_deliveryman() {
        return id_deliveryman;
    }

    public void setId_deliveryman(Long id_deliveryman) {
        this.id_deliveryman = id_deliveryman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}

