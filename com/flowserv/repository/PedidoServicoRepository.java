package com.flowserv.repository;

import com.flowserv.model.PedidoServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoServicoRepository
        extends JpaRepository<PedidoServico, Long> {
}