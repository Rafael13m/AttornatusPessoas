package com.attornatus.pessoas.application.service;

import com.attornatus.pessoas.application.api.*;
import com.attornatus.pessoas.application.repository.PessoaRepository;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

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

    @Override
    public List<ListPessoas> buscaTodasPessoas() {
        log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
        List<Pessoa> listPessoas = pessoaRepository.buscaTodasPessoas();
        log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
        return ListPessoas.converte(listPessoas);
    }

    @Override
    public PessoaDTO buscaPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoaApplicationService - buscaPessoaPorId");
        Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        log.info("[finaliza] PessoaApplicationService - buscaPessoaPorId");
        return new PessoaDTO(pessoa);
    }

    @Override
    public void alteraPessoa(PessoaAlteracao pessoaAlteracao, UUID idPessoa) {
        log.info("[inicia] PessoaApplicationService - alteraPessoa");
        Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        pessoa.alterar(pessoaAlteracao);
        pessoaRepository.salva(pessoa);
        log.info("[finaliza] PessoaApplicationService - alteraPessoa");
    }



}
