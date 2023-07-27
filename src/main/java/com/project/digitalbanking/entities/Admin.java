package com.project.digitalbanking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User{
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String adminId;
}
