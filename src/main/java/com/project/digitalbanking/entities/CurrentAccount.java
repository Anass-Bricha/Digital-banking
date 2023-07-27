package com.project.digitalbanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("current")
public class CurrentAccount extends Account{
    private double overdraft;
}
