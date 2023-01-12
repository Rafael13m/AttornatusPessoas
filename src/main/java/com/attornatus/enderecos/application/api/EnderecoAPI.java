package com.attornatus.enderecos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/enderecos")
public interface EnderecoAPI {

    @PostMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.CREATED)
    void adicionarEndereco(@PathVariable UUID idPessoa, @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoDTO> buscarEnderecosDePessoa(@PathVariable UUID idPessoa);

    @GetMapping (value ="/enderecoprincipal/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    EnderecoDTO buscarEnderecoPrincipal(@PathVariable UUID idPessoa);
}
