package com.attornatus.pessoas.domain;


import com.attornatus.enderecos.domain.Endereco;
import com.attornatus.pessoas.application.api.PessoaRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@NoArgsConstructor
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid")
    private UUID idPessoa;
    private String nome;
    private LocalDate dataNascimento;
    @OneToMany(cascade=CascadeType.PERSIST)
    private List<Endereco> enderecos;

    public Pessoa(PessoaRequest pessoaRequest) {
        this.nome = pessoaRequest.getNome();
        this.dataNascimento = pessoaRequest.getDataNascimento();
        this.enderecos = pessoaRequest.getEnderecos();
    }
}
