package br.com.alura.screenmatch.service;

public interface IConverteDados {

//    <T> significa genárico
    <T> T obterDados(String json, Class<T> classe);

}
