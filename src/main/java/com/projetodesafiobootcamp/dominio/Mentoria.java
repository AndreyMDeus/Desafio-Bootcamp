package com.projetodesafiobootcamp.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo {

    private LocalDate dataMentoria;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +
                ", descrição=" + getDescricao() +
                ", dataMentoria=" + dataMentoria +
                '}';
    }
}
