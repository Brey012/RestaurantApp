package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumRequest;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_request;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "fk_user", referencedColumnName = "id_user")
    private  User user;

    @Column(name = "request_type", length = 100, nullable = false)
    private EnumRequest request;
    @Column(name = "status_request", length = 100, nullable = false)
    private String status;
    @Column(name = "date_request", length = 100, nullable = false)
    private String date_request;
    @Column(name = "total", length = 100, nullable = false)
    private String total;

    public Request() {
    }

    public Request(Long id_request, EnumRequest request, String status, String date_request, String total) {
        this.id_request = id_request;

        this.request = request;
        this.status = status;
        this.date_request = date_request;
        this.total = total;
    }

    public Long getId_request() {
        return id_request;
    }

    public void setId_request(Long id_request) {
        this.id_request = id_request;
    }

    public EnumRequest getRequest() {
        return request;
    }

    public void setRequest(EnumRequest request) {
        this.request = request;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate_request() {
        return date_request;
    }

    public void setDate_request(String date_request) {
        this.date_request = date_request;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
