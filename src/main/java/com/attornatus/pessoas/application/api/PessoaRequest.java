package com.attornatus.pessoas.application.api;

import com.attornatus.enderecos.domain.Endereco;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PessoaRequest {
    private String Nome;
    private LocalDate DataNascimento;
    private List<Endereco> endereco;
}
