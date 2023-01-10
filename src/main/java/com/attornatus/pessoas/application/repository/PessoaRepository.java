package com.attornatus.pessoas.application.repository;

import com.attornatus.pessoas.application.api.ListPessoas;
import com.attornatus.pessoas.application.api.PessoaAlteracao;
import com.attornatus.pessoas.domain.Pessoa;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);

    Pessoa buscaPessoaPorId(UUID idPessoa);

    List<Pessoa> buscaTodasPessoas();

}
