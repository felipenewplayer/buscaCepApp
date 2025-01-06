package com.example.felipe.BuscaCepESalva.menu;

import com.example.felipe.BuscaCepESalva.model.EnderecoDto;
import com.example.felipe.BuscaCepESalva.service.ConsumoApi;
import com.example.felipe.BuscaCepESalva.service.Conversor;
import com.example.felipe.BuscaCepESalva.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Principal {

    @Autowired
    private EnderecoService service;
    public void menu() {
        Scanner sc = new Scanner(System.in);
        ConsumoApi consumo = new ConsumoApi();
        Conversor conversor = new Conversor();

        while (true) {

            System.out.println("\n***************************");
            System.out.println("Digite o número de um Cep:");

            String numeroCep = sc.nextLine();
            if (numeroCep.length() == 8) {
                String json = consumo.obterDados(numeroCep);

                EnderecoDto dados = conversor.dadosConversor(json, EnderecoDto.class);
                service.salvarEndereco(dados);
                break;
            } else {
                System.out.println("Número inválido, digite 8 dígitos!!!");
            }
        }
        sc.close();
    }
}

