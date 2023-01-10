package com.attornatus.pessoas.application.repository;

import com.attornatus.pessoas.domain.Pessoa;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);
}
