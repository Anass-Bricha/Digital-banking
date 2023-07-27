package com.project.digitalbanking.entities;

import com.project.digitalbanking.enums.OperationType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Date date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;

    @ManyToOne
    private Account account;
}
