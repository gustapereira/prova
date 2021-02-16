package com.apphouse.evaluation.enums;

import lombok.Getter;

@Getter
public enum PerfilEnum {

    USUARIO("Usuario"),
    ADMINISTRADOR("Administrador");


    private final String descricao;

    PerfilEnum(String descricao) {
        this.descricao = descricao;
    }
}
