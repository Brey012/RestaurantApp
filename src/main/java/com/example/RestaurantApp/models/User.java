package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumUser;
import jakarta.persistence.*;

@Entity
@Table(name = "User_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private long id;

    @Column(length = 100, unique = true, nullable = false)
    private String name;
    private String email;
    private String password;
    private EnumUser userType;

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
