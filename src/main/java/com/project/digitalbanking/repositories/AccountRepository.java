package com.project.digitalbanking.repositories;

import com.project.digitalbanking.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}