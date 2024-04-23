package com.f0xer.entitymanagerservice.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "customer")
    private String customer;
    @Column(name = "total_amount")
    private double totalAmount;
    @OneToMany(mappedBy = "order")
    private List<Item> items;
}
