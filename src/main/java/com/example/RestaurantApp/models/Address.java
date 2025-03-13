package com.example.RestaurantApp.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_address;


    private Long id_user;
    @Column(name = "street_address", length = 100, nullable = false)
    private String street;
    @Column(name = "city_address", length = 100, nullable = false)
    private String city;
    @Column(name = "code_postal_address", length = 100, nullable = false)
    private String code_postal;
    @Column(name = "country_address", length = 100, nullable = false)
    private String country;

    //Bucle de serialización

    @ManyToOne
    @JoinColumn(name = "fk_user", referencedColumnName = "id_user")
    @JsonBackReference
    private  User user;

    public Address() {
    }

    public Address(Long id_address, Long id_user, String street, String city, String code_postal, String country) {
        this.id_address = id_address;
        this.id_user = id_user;
        this.street = street;
        this.city = city;
        this.code_postal = code_postal;
        this.country = country;
    }

    public Long getId_address() {
        return id_address;
    }

    public void setId_address(Long id_address) {
        this.id_address = id_address;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
