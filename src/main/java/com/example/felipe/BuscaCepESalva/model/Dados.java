package com.example.felipe.BuscaCepESalva.model;

public class Dados {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;

    public Dados() {
    }

    public Dados(DadosDto dadosDto) {
        this.cep = dadosDto.cep();
        this.logradouro = dadosDto.logradouro();
        this.complemento = dadosDto.complemento();
        this.bairro = dadosDto.bairro();
        this.localidade = dadosDto.localidade();
        this.uf = dadosDto.uf();
        this.estado = dadosDto.estado();
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "[" +
                "cep = " + cep +
                "logradouro = " + logradouro +
                " complemento = " + complemento +
                "bairro = " + bairro +
                "localidade = " + localidade +
                "uf = " + uf + '\'' +
                "estado= " + estado +
                "]";
    }
}
