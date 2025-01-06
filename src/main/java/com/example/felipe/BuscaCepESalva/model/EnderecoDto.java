package com.example.felipe.BuscaCepESalva.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record EnderecoDto(
        @JsonAlias("cep")
        String cep,
        @JsonAlias("logradouro")
        String logradouro,
        @JsonAlias("bairro")
        String bairro,
        @JsonAlias("localidade")
        String localidade,
        @JsonAlias("uf")
        String uf,
        @JsonAlias("estado")
        String estado
) {
}