package com.attornatus.enderecos.domain;

import com.attornatus.pessoas.application.api.PessoaRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID idEndereco;
    private String logradouro;
    private int cep;
    private int numero;
    private String cidade;
}