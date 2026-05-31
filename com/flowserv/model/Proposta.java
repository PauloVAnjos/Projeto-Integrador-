package com.flowserv.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "propostas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proposta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal valor;

    private String prazoExecucao;

    private String status;

    @Column(length = 1000)
    private String descricao;

    private LocalDateTime dataEnvio = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoServico pedido;

    @ManyToOne
    @JoinColumn(name = "prestador_id")
    private Prestador prestador;
}
