package com.attornatus.enderecos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("enderecos")
public interface EnderecoAPI {

    @PostMapping(value = "/novoendereco/{idPessoa}")
    @ResponseStatus(code = HttpStatus.CREATED)
    void adicionarEndereco(@PathVariable UUID idPessoa, @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoDTO> buscarEnderecosDePessoa(@PathVariable UUID idPessoa);


}
