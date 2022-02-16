package com.projetodesafiobootcamp;

import com.projetodesafiobootcamp.dominio.*;

import java.time.LocalDate;

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

        //Exemplo de polimorfismo instanciando uma classe através da classe pai/mãe

        Conteudo curso3 = new Curso();
        curso3.setTitulo("COBOL Avançado");
        curso3.setDescricao("CICS Avançado");

        Conteudo mentoria3 = new Mentoria();
        mentoria3.setTitulo("Javascript básico");
        mentoria3.setDescricao("Conceitos básicos");

        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Desenvolvimento Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Andrey Martins");
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.setConteudosInscritos(bootcamp1.getConteudos());
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos concluídos: " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + dev1.getNome() + ": " + dev1.getConteudosInscritos());

        if (dev1.getConteudosInscritos().isEmpty()) System.out.println("O Dev concluiu todos os conteúdos!");
        System.out.println("O Dev tem um total de " + dev1.calcularXP() + " XP");





    }
}
