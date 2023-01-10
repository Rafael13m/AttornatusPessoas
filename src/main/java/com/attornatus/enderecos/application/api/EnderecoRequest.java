package com.attornatus.enderecos.application.api;

import lombok.Data;

@Data
public class EnderecoRequest {

    private String logradouro;
    private int cep;
    private int numero;
    private String cidade;

}
