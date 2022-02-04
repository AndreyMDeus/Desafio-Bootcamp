package com.projetodesafiobootcamp.dominio;

import java.util.Objects;

public class Curso {

    private String titulo;
    private String descricao;
    private Integer cargaHoraria;

    public Integer calcularXp() {
        return 0;
    }

    public Curso() {
    }

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        return titulo.equals(curso.titulo) && descricao.equals(curso.descricao) && cargaHoraria.equals(curso.cargaHoraria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHoraria);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}