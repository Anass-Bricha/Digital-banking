package com.project.digitalbanking.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("saving")
public class SavingAccount extends Account{
    private double interestRate;
}
