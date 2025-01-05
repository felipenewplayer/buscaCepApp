package com.example.felipe.BuscaCepESalva.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Conversor implements IConversor {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T dadosConversor(String json, Class<T> classe) {
        try {
            mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
