package com.attornatus.enderecos.application.service;

import com.attornatus.enderecos.application.api.EnderecoDTO;
import com.attornatus.enderecos.application.api.EnderecoRequest;
import com.attornatus.enderecos.domain.Endereco;
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
public class EnderecosApplicationService implements EnderecosService {

    private final PessoaRepository pessoaRepository;

    public void adicionarEndereco(UUID idPessoa, EnderecoRequest enderecoRequest){
        log.info("[inicia] EnderecosApplicationService - adicionaEndereco");
        Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        pessoa.adicionarEndereco(enderecoRequest);
        pessoaRepository.salva(pessoa);
        log.info("[finaliza] EnderecosApplicationService - adicionaEndereco");
    }

    @Override
    public List<EnderecoDTO> buscarEnderecosDePessoas(UUID idPessoa) {
        log.info("[inicia] EnderecosApplicationService - buscarEnderecosDePessoas");
        Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        List<Endereco> enderecos = pessoa.getEnderecos();
        log.info("[finaliza] EnderecosApplicationService - buscarEnderecosDePessoas");
        return EnderecoDTO.converte(enderecos);
    }

    @Override
    public List<EnderecoDTO> buscarEnderecoPrincipal(UUID idPessoa) {
        log.info("[inicia] EnderecosApplicationService - buscarEnderecosDePessoas");
        Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
        List<Endereco> endereco = pessoa.buscarEnderecoPrincipal();
        log.info("[finaliza] EnderecosApplicationService - buscarEnderecosDePessoas");
        return EnderecoDTO.converte(endereco);
    }
}
