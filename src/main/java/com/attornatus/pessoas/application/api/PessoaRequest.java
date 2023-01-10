package com.attornatus.pessoas.application.api;

import com.attornatus.enderecos.domain.Endereco;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Data
@Getter
public class PessoaRequest {
    private String Nome;
    private LocalDate DataNascimento;
    private List<Endereco> enderecos;
}
