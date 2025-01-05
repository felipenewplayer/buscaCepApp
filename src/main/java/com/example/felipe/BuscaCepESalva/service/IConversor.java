package com.example.felipe.BuscaCepESalva.service;

public interface IConversor {

    <T> T dadosConversor(String json, Class<T> classe);
}
