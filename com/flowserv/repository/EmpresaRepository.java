package com.flowserv.repository;

import com.flowserv.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository
        extends JpaRepository<Empresa, Long> {
}