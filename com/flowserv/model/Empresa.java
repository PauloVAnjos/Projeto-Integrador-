package com.flowserv.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empresas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cnpj;

    private String nomeFantasia;

    private String endereco;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}