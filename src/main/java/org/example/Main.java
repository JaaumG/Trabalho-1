package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in); //Iniciando o scanner
        System.out.println("Digite quantos alunos terão suas médias calculadas:");
        int quantidadeAlunos = sc.nextInt(); //lendo quantidade de alunos
        sc.nextLine(); //Lendo linha "bugada" por ter utilizado o next int préviamente.
        Aluno[] alunos = new Aluno[quantidadeAlunos]; //Vetor do objeto aluno 
        for (int i = 0; i < quantidadeAlunos; i++) { //Loop para ler cada aluno
            System.out.println("Digite o nome do aluno "+(i+1)+":");
            String nome = sc.nextLine(); //Lendo o nome do aluno
            System.out.println("Digite a nota do primeiro Bimestre");
            double notasPrimeiroBim = sc.nextDouble(); //nota do primeiro bismetre
            System.out.println("Digite a nota do segundo Bimestre");
            double notasSegundoBim = sc.nextDouble(); //nota do segundo bismetre
            sc.nextLine(); //Lendo linha "bugada" por ter utilizado o next double préviamente.
            alunos[i] = new Aluno(nome, notasPrimeiroBim, notasSegundoBim); 
            //Utilizando o construturo de aluno e guardando no vetor na posição i o novo aluno
        }
        sc.close(); //fechando o scanner
        for (int i = 0; i < quantidadeAlunos; i++) { //Loop para imprimir cada aluno
            if(alunos[i].media()>= 6){ //Verificando se média é maior ou igual 6
                System.out.println("Aluno: " + alunos[i].getNome() + " APROVADO, média: " + alunos[i].media());
                //Caso for será impresso "Aluno: " concatenando com o valor do nome na posição i do vetor de nomes e concatenando com " APROVADO, média: "
                //e por fim concatenando com a media
            }else{
                System.out.println("Aluno: " + alunos[i].getNome() + " REPROVADO, média: " + alunos[i].media());
                //Caso contrario será impresso "Aluno: " concatenando com o valor do nome na posição i do vetor de nomes e concatenando com " REPROVADO, média: "
                //e por fim concatenando com a media
            }
        }
    }
}