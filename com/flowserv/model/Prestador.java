package com.flowserv.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "prestadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;

    private String descricao;

    private String areaAtuacao;

    private Boolean verificado;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}