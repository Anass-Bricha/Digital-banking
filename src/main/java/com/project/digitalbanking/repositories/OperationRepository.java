package com.project.digitalbanking.repositories;

import com.project.digitalbanking.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, String> {
}