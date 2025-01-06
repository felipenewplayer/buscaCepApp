package com.example.felipe.BuscaCepESalva.service;

import com.example.felipe.BuscaCepESalva.model.Endereco;
import com.example.felipe.BuscaCepESalva.model.EnderecoDto;
import com.example.felipe.BuscaCepESalva.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public void salvarEndereco(EnderecoDto enderecoDto) {
        Endereco endereco = new Endereco();
        endereco.setCep(enderecoDto.cep());
        endereco.setLogradouro(enderecoDto.logradouro());
        endereco.setBairro(enderecoDto.bairro());
        endereco.setLocalidade(enderecoDto.estado());
        endereco.setUf(enderecoDto.uf());
        enderecoRepository.save(endereco);
    }
}


