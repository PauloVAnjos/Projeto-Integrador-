package com.flowserv.repository;

import com.flowserv.model.Proposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaRepository
        extends JpaRepository<Proposta, Long> {
}