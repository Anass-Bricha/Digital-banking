package com.project.digitalbanking.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer extends User{
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @OneToMany
    private List<Account> accounts;
}
