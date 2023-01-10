package com.attornatus.pessoas.application.service;

import com.attornatus.pessoas.application.api.ListPessoas;
import com.attornatus.pessoas.application.api.PessoaRequest;
import com.attornatus.pessoas.application.api.PessoaResponse;
import com.attornatus.pessoas.domain.Pessoa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PessoaService {
    public PessoaResponse criarPessoa(PessoaRequest pessoaRequest);

    Optional<Pessoa> buscaPessoaPorId(UUID idPessoa);

    List<ListPessoas> buscaTodasPessoas();
}
