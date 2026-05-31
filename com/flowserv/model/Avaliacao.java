package com.flowserv.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "avaliacoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer nota;

    @Column(length = 500)
    private String comentario;

    private LocalDateTime dataAvaliacao = LocalDateTime.now();

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private PedidoServico pedido;
}