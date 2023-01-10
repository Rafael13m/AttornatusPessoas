package com.attornatus.pessoas.infra;

import com.attornatus.pessoas.application.repository.PessoaRepository;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
@Slf4j
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {

    private final PessoaJpaRepository pessoaJpaRepository;
    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salva");
        pessoaJpaRepository.save(pessoa);
        log.info("[finaliza] PessoaInfraRepository - salva");
        return pessoa;
    }

    @Override
    public Optional<Pessoa> buscaPessoaPorId(UUID idPessoa) {
        Optional<Pessoa> pessoa = pessoaJpaRepository.findById(idPessoa);
        return pessoa;
    }
}
