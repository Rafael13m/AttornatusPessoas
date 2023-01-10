package com.attornatus.pessoas.application.service;

import com.attornatus.pessoas.application.api.PessoaRequest;
import com.attornatus.pessoas.application.api.PessoaResponse;
import com.attornatus.pessoas.application.repository.PessoaRepository;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {

    private final PessoaRepository pessoaRepository;
    @Override
    public PessoaResponse criarPessoa(PessoaRequest pessoaRequest) {
        log.info("[inicia] PessoaApplicationService - criarPessoa");
        Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
        log.info("[finaliza] PessoaApplicationService - criarPessoa");
        return PessoaResponse.builder()
                .idPessoa(pessoa.getIdPessoa())
                .build();
    }
}
