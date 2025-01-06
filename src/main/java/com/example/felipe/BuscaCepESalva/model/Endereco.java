package com.example.felipe.BuscaCepESalva.model;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "endereços")
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String bairro, String localidade, String estado) {
    }
}
