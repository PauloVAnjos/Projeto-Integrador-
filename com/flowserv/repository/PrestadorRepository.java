package com.flowserv.repository;

import com.flowserv.model.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository
        extends JpaRepository<Prestador, Long> {
}