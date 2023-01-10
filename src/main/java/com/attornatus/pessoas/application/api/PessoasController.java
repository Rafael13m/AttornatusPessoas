package com.attornatus.pessoas.application.api;

import com.attornatus.pessoas.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class PessoasController implements PessoasAPI {

    private final PessoaService pessoaService;
    @Override
    public PessoaResponse criarPessoa(PessoaRequest pessoaRequest) {
        log.info("[inicia] PessoasController - criarPessoa");
        PessoaResponse pessoaResponse = pessoaService.criarPessoa(pessoaRequest);
        log.info("[finaliza] PessoasController - criarPessoa");
        return pessoaResponse;
    }
}
