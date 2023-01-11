package com.attornatus.enderecos.application.api;

import com.attornatus.enderecos.application.service.EnderecosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {

    private final EnderecosService enderecosService;

    @Override
    public void adicionarEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - novoEndereco");
        enderecosService.adicionarEndereco(idPessoa, enderecoRequest);
        log.info("[finaliza] EnderecoController - novoEndereco");
    }

    @Override
    public List<EnderecoDTO> buscarEnderecosDePessoa(UUID idPessoa) {
        log.info("[inicia] EnderecoController - buscarEnderecosDePessoa");
        List<EnderecoDTO> enderecoDTOS = enderecosService.buscarEnderecosDePessoas(idPessoa);
        log.info("[finaliza] EnderecoController - buscarEnderecosDePessoa");
        return enderecoDTOS;
    }

    @Override
    public List<EnderecoDTO> buscarEnderecoPrincipal(UUID idPessoa) {
        log.info("[inicia] EnderecoController - buscarEnderecoPrincipal");
        List<EnderecoDTO> edereco = enderecosService.buscarEnderecoPrincipal(idPessoa);
        log.info("[finaliza] EnderecoController - buscarEnderecoPrincipal");
        return edereco;
    }
}

