package com.example.felipe.BuscaCepESalva.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosDto(
         @JsonAlias
         String cep,
         String logradouro,
         String complemento,
         String bairro,
         String localidade,
         String uf,
         String estado
) {
}
