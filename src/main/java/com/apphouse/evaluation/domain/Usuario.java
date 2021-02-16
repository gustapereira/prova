package com.apphouse.evaluation.domain;

import com.apphouse.evaluation.enums.PerfilEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_USUARIO")
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "TX_CPF")
    private String cpf;

    @Column(name = "TX_LOGIN")
    private String login;

    @Column(name = "PW_SENHA")
    private String senha;

    @Column(name = "EMUM_PERFIL")
    @Enumerated(EnumType.STRING)
    private PerfilEnum perfil;

}
