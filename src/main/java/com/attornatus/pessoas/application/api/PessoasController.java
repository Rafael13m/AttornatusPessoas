package com.attornatus.pessoas.application.api;

import com.attornatus.pessoas.application.service.PessoaService;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

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

    @Override
    public Optional<Pessoa> buscaPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoasController - buscaPessoaPorId");
        Optional<Pessoa> pessoa = pessoaService.buscaPessoaPorId(idPessoa);
        log.info("[finaliza] PessoasController - buscaPessoaPorId");
        return pessoa;
    }
}
