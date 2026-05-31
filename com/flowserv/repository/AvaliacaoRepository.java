package com.flowserv.repository;

import com.flowserv.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository
        extends JpaRepository<Avaliacao, Long> {
}
