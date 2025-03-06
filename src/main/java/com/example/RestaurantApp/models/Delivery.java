package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumDelivery;
import jakarta.persistence.*;

@Entity
@Table(name = "Delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_delivery;
    private Long id_order;
    private Long id_deliveryman;

    @Column(name = "date_delivery", length = 100, nullable = false)
    private String date;
    @Column(name = "status_delivery", length = 100, nullable = false)
    private EnumDelivery status;

    public Delivery() {
    }

    public Delivery(Long id_delivery, Long id_order, Long id_deliveryman, String date, EnumDelivery status) {
        this.id_delivery = id_delivery;
        this.id_order = id_order;
        this.id_deliveryman = id_deliveryman;
        this.date = date;
        this.status = status;
    }

    public Long getId_delivery() {
        return id_delivery;
    }

    public void setId_delivery(Long id_delivery) {
        this.id_delivery = id_delivery;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public Long getId_deliveryman() {
        return id_deliveryman;
    }

    public void setId_deliveryman(Long id_deliveryman) {
        this.id_deliveryman = id_deliveryman;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public EnumDelivery getStatus() {
        return status;
    }

    public void setStatus(EnumDelivery status) {
        this.status = status;
    }
}
