package com.projetodesafiobootcamp.dominio;

import java.util.*;

public class Dev {

    public String nome;
    public Set<Conteudo> mentoriasInscritos = new LinkedHashSet<>();
    public Set<Conteudo> atividadesConcluidas = new LinkedHashSet<>();

    public void inscreverNoBootcamp(Bootcamp bootcamp) {

    }

    public void progredir() {

    }

    public void calcularTotalXp() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getMentoriasInscritos() {
        return mentoriasInscritos;
    }

    public void setMentoriasInscritos(Set<Conteudo> mentoriasInscritos) {
        this.mentoriasInscritos = mentoriasInscritos;
    }

    public Set<Conteudo> getAtividadesConcluidas() {
        return atividadesConcluidas;
    }

    public void setAtividadesConcluidas(Set<Conteudo> atividadesConcluidas) {
        this.atividadesConcluidas = atividadesConcluidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && mentoriasInscritos.equals(dev.mentoriasInscritos) && atividadesConcluidas.equals(dev.atividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, mentoriasInscritos, atividadesConcluidas);
    }
}
