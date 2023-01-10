package com.attornatus.pessoas.application.service;

import com.attornatus.enderecos.domain.Endereco;
import com.attornatus.pessoas.application.api.ListPessoas;
import com.attornatus.pessoas.application.api.PessoaRequest;
import com.attornatus.pessoas.application.api.PessoaResponse;
import com.attornatus.pessoas.application.repository.PessoaRepository;
import com.attornatus.pessoas.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;
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
    public Optional<Pessoa> buscaPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoaApplicationService - buscaPessoaPorId");
        Optional<Pessoa> pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        log.info("[finaliza] PessoaApplicationService - buscaPessoaPorId");
        return pessoa;
    }

    @Override
    public List<ListPessoas> buscaTodasPessoas() {
        log.info("[inicia] PessoaApplicationService - buscaTodasPessoas");
        List<Pessoa> listPessoas = pessoaRepository.buscaTodasPessoas();
        log.info("[finaliza] PessoaApplicationService - buscaTodasPessoas");
        return ListPessoas.converte(listPessoas);
    }
}
