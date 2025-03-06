package com.example.RestaurantApp.models;

import com.example.RestaurantApp.Enums.EnumStatusPay;
import com.example.RestaurantApp.Enums.MethodPay;
import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_payment;
    private Long id_order;

    @Column(name = "method_payment", length = 100, nullable = false)
    private MethodPay method;
    @Column(name = "status_payment", length = 100, nullable = false)
    private EnumStatusPay status;

    public Payment() {
    }

    public Payment(Long id_payment, Long id_order, MethodPay method, EnumStatusPay status) {
        this.id_payment = id_payment;
        this.id_order = id_order;
        this.method = method;
        this.status = status;
    }

    public Long getId_payment() {
        return id_payment;
    }

    public void setId_payment(Long id_payment) {
        this.id_payment = id_payment;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public MethodPay getMethod() {
        return method;
    }

    public void setMethod(MethodPay method) {
        this.method = method;
    }

    public EnumStatusPay getStatus() {
        return status;
    }

    public void setStatus(EnumStatusPay status) {
        this.status = status;
    }
}
