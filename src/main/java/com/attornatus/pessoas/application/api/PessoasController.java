package com.attornatus.pessoas.application.api;

import com.attornatus.pessoas.application.service.PessoaService;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
    public List<ListPessoas> buscaTodasPessoas() {
        log.info("[inicia] PessoasController - buscaTodasPessoas");
        List<ListPessoas> pessoasList = pessoaService.buscaTodasPessoas();
        log.info("[finaliza] PessoasController - buscaTodasPessoas");
        return pessoasList;
    }

    @Override
    public PessoaDTO buscaPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoasController - buscaPessoaPorId");
        PessoaDTO pessoa = pessoaService.buscaPessoaPorId(idPessoa);
        log.info("[finaliza] PessoasController - buscaPessoaPorId");
        return pessoa;

    }

    @Override
    public void AlteraPessoa(UUID idPessoa, PessoaAlteracao pessoaAlteracao) {
        log.info("[inicia] PessoasController - buscaPessoaPorId");
        pessoaService.alteraPessoa(pessoaAlteracao, idPessoa);
        log.info("[finaliza] PessoasController - buscaPessoaPorId");
    }
}
