package com.example.condominio.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Apartamento {
    @EqualsAndHashCode.Include
    private Long id;
    private int numero;
    private int andar;
    private double metragem;
    private String situacao;
    private Morador morador;

    public Apartamento(int numero, int andar, double metragem, String situacao, Morador morador) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.morador = morador;
    }
}
