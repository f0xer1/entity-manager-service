package com.f0xer.entitymanagerservice.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "country_of_origin")
    private String countryOfOrigin;
    @ManyToOne
    @JoinColumn(name = "order_id",nullable = false)
    private Order order;
}
