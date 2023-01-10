package com.attornatus.pessoas.application.api;

import javax.validation.Valid;

import com.attornatus.pessoas.domain.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("pessoas")
public interface PessoasAPI {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse criarPessoa(@RequestBody PessoaRequest pessoaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<ListPessoas> buscaTodasPessoas();

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    PessoaDTO buscaPessoaPorId(@PathVariable UUID idPessoa);

    @PatchMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void AlteraPessoa(@PathVariable UUID idPessoa, @RequestBody PessoaAlteracao pessoaAlteracao);



}
