package com.attornatus.pessoas.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pessoas")
public interface PessoasAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse criarPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

}
