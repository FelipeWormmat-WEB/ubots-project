package com.ubots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubots.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {
   
}