package com.attornatus.pessoas.infra;

import com.attornatus.pessoas.application.api.ListPessoas;
import com.attornatus.pessoas.application.repository.PessoaRepository;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Slf4j
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {

    private final PessoaJpaRepository pessoaJpaRepository;
    @Override
    public Pessoa salvarPessoa(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salvarPessoa");
        pessoaJpaRepository.save(pessoa);
        log.info("[finaliza] PessoaInfraRepository - salvarPessoa");
        return pessoa;
    }

    @Override
    public Pessoa buscarPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoaInfraRepository - buscarPessoaPorId");
        Pessoa pessoa = pessoaJpaRepository.findById(idPessoa)
                .orElseThrow();
        log.info("[finaliza] PessoaInfraRepository - buscarPessoaPorId");
        return pessoa;
    }

    @Override
    public List<Pessoa> buscarTodasPessoas() {
        log.info("[inicia] PessoaInfraRepository - buscarTodasPessoas");
        List<Pessoa> listPessoas = pessoaJpaRepository.findAll();
        log.info("[finaliza] PessoaInfraRepository - buscarTodasPessoas");
        return listPessoas;
    }
}
