package com.example.felipe.BuscaCepESalva.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class Conversor implements IConversor {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public  <T> T dadosConversor(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
