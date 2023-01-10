package com.attornatus.pessoas.application.api;

import javax.validation.Valid;

import com.attornatus.pessoas.domain.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("pessoas")
public interface PessoasAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse criarPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    Optional<Pessoa> buscaPessoaPorId(@PathVariable UUID idPessoa);

}
