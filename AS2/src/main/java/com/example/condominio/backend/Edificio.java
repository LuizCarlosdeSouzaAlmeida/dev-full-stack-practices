package com.example.condominio.backend;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarApartamento(Apartamento apartamento) {
        this.apartamentos.add(apartamento);
    }
    public void mostrarApartamentos() {
        for (int i=0; i< apartamentos.size(); i++) {
            System.out.println(apartamentos.get(i));
        }
    }
}
