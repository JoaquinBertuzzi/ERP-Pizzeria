package com.pizzeria.erp_pizzeria.repository;

import com.pizzeria.erp_pizzeria.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
