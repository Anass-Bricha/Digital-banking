package com.project.digitalbanking.entities;

import com.project.digitalbanking.enums.AccountStatus;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type")
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int accountNumber;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
}
