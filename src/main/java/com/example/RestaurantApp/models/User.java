package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumUser;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long id;

    @Column(name = "name_user", length = 100, nullable = false)
    private String name;
    @Column(name = "email_user", length = 100, nullable = false)
    private String email;
    @Column(name = "password_user", length = 100, nullable = false)
    private String password;
    @Column(name = "user_type", length = 100, nullable = false)
    private EnumUser userType;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Address> directions;


    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Request> requests;


    public User() {
    }

    public User(long id, String name, String email, String password, EnumUser userType) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnumUser getUserType() {
        return userType;
    }

    public void setUserType(EnumUser userType) {
        this.userType = userType;
    }
}
