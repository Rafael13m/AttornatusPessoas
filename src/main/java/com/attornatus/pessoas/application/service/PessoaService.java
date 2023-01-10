package com.attornatus.pessoas.application.service;

import com.attornatus.pessoas.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PessoaService {
    public PessoaResponse criarPessoa(PessoaRequest pessoaRequest);

    PessoaDTO buscaPessoaPorId(UUID idPessoa);

    List<ListPessoas> buscaTodasPessoas();

    void alteraPessoa(PessoaAlteracao pessoaAlteracao, UUID idPessoa);
}
