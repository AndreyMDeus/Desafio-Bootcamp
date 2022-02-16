package com.projetodesafiobootcamp;

import com.projetodesafiobootcamp.dominio.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BootcampMain {

    public static void main(String[] args) {

        //Criando os objetos
        Curso curso1       = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Desenvolvimento Java");
        curso1.setCargaHoraria(60);
        Curso curso2       = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Desenvolvimento PHP");
        curso2.setCargaHoraria(40);
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("IDEs Java");
        mentoria1.setDescricao("Utilizando uma IDA Java");
        mentoria1.setDataMentoria(LocalDate.of(2018, 07, 22));
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("SQL Server");
        mentoria2.setDescricao("Entendendo o SQL Server");
        mentoria2.setDataMentoria(LocalDate.now());
        Dev dev1 = new Dev();
        dev1.setNome("Andrey Martins de Deus");
        Bootcamp bootcamp1 = new Bootcamp();


    }
}
