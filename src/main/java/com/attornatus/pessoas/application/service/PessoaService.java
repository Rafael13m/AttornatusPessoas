package com.attornatus.pessoas.application.service;

import com.attornatus.pessoas.application.api.PessoaRequest;
import com.attornatus.pessoas.application.api.PessoaResponse;
import org.springframework.stereotype.Service;

public interface PessoaService {
    public PessoaResponse criarPessoa(PessoaRequest pessoaRequest);

}
