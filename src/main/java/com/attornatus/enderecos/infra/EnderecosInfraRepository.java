package com.attornatus.enderecos.infra;

import com.attornatus.enderecos.application.repository.EnderecosRepository;
import com.attornatus.enderecos.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
@RequiredArgsConstructor
public class EnderecosInfraRepository implements EnderecosRepository {

    private final EnderecosJpaRepository enderecosJpaRepository;
    @Override
    public void salvaEndereco(Endereco endereco) {
        log.info("[inicia] EnderecosInfraRepository - salvaEndereco");
        enderecosJpaRepository.save(endereco);
        log.info("[finaliza] EnderecosInfraRepository - salvaEndereco");
    }
}
