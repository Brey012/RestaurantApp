package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumRequest;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_request;
    private Long id_user;
    private Long id_product;

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

    public Request(Long id_request, Long id_user, Long id_product, EnumRequest request, String status, String date_request, String total) {
        this.id_request = id_request;
        this.id_user = id_user;
        this.id_product = id_product;
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

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
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
