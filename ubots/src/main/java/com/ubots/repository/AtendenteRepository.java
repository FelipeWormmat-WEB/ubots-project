package com.ubots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubots.model.Atendente;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Integer> {

}