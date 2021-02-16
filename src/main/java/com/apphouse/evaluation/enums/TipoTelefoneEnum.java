package com.apphouse.evaluation.enums;

import lombok.Getter;

@Getter
public enum TipoTelefoneEnum {

    RESIDENCIAL("Residencial"),
    COMERCIAL("Comercial"),
    CELULAR("Celular");


    private final String descricao;

    TipoTelefoneEnum(String descricao) {
        this.descricao = descricao;
    }
}
