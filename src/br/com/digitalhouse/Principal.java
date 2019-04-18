package br.com.digitalhouse;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        //cursos
        Curso fullstack = new Curso("WEB Fullstack - muito mass tbm");
        Curso android = new Curso ("Mobile Android - muito massa");


        //Alunos
        Aluno vini = new Aluno(123,"Vinicius","Oliveira",20,android);
        Aluno vinicius = new Aluno(123456,"Vinicius","Oliveira",20,android);
        Aluno jessica = new Aluno(321,"Jessica","Milena",15,fullstack);
        Aluno hendy = new Aluno(456,"Hendy","Almeida",34,fullstack);
        Aluno ana = new Aluno(654,"Ana","Pereira",22,android);

        List <Aluno> aluno = new ArrayList<>();

        aluno.add (vini);
        aluno.add (jessica);
        aluno.add (hendy);
        aluno.add (ana);

        System.out.println(
                  // vini.equals (vinicius));
                    aluno.contains(vinicius));



    }
}
