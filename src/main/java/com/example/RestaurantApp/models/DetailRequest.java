package com.example.RestaurantApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "DetailRequest")
public class DetailRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_detailRequest;
    private Long id_order;
    private Long id_product;

    @Column(name = "quantity_detailRequest", length = 100, nullable = false)
    private int quantity;
    @Column(name = "subtotal_detailRequest", length = 100, nullable = false)
    private double subtotal;

    public DetailRequest() {
    }

    public DetailRequest(Long id_detailRequest, Long id_order, Long id_product, int quantity, double subtotal) {
        this.id_detailRequest = id_detailRequest;
        this.id_order = id_order;
        this.id_product = id_product;
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public Long getId_detailRequest() {
        return id_detailRequest;
    }

    public void setId_detailRequest(Long id_detailRequest) {
        this.id_detailRequest = id_detailRequest;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public Long getId_product() {
        return id_product;
    }

    public void setId_product(Long id_product) {
        this.id_product = id_product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
