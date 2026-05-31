package com.flowserv.repository;

import com.flowserv.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository
        extends JpaRepository<Servico, Long> {
}