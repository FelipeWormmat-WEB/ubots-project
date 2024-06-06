package com.ubots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ubots.model.FilaSolicitacao;

@Repository
public interface FilaSolicitacaoRepository extends JpaRepository<FilaSolicitacao, Integer> {
    
}