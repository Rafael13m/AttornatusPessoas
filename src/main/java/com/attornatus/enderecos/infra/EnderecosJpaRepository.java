package com.attornatus.enderecos.infra;

import com.attornatus.enderecos.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecosJpaRepository extends JpaRepository<Endereco, UUID> {
}
