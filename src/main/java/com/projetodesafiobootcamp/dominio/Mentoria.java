package com.projetodesafiobootcamp.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate dataMentoria;

    public Integer calcularXp() {
        return 0;
    }

    public Mentoria() {
    }

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
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

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return titulo.equals(mentoria.titulo) && descricao.equals(mentoria.descricao) && dataMentoria.equals(mentoria.dataMentoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, dataMentoria);
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataMentoria=" + dataMentoria +
                '}';
    }

}
