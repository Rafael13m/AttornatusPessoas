package com.attornatus.pessoas.application.repository;

import com.attornatus.pessoas.domain.Pessoa;

import java.util.Optional;
import java.util.UUID;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);

    Optional<Pessoa> buscaPessoaPorId(UUID idPessoa);
}
