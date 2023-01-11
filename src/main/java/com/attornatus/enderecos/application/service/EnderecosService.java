package com.attornatus.enderecos.application.service;

import com.attornatus.enderecos.application.api.EnderecoDTO;
import com.attornatus.enderecos.application.api.EnderecoRequest;

import java.util.List;
import java.util.UUID;

public interface EnderecosService {

    void adicionarEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);

    List<EnderecoDTO> buscarEnderecosDePessoas(UUID idPessoa);

    List<EnderecoDTO> buscarEnderecoPrincipal(UUID idPessoa);
}
