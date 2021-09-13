package com.mmiranda.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmiranda.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
