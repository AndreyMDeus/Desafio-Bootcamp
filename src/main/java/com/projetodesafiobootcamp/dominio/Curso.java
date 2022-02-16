package com.projetodesafiobootcamp.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria.equals(curso.cargaHoraria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargaHoraria);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "título=" + getTitulo() +
                ", descrição=" + getDescricao() +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
