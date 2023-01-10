package com.attornatus.enderecos.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("enderecos")
public interface EnderecoAPI {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    


}
