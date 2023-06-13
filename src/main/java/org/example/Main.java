package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos alunos terão suas médias calculadas:");
        int quantidadeAlunos = sc.nextInt();
        sc.nextLine();
        Aluno[] alunos = new Aluno[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno "+i+":");
            String nome = sc.nextLine();
            System.out.println("Digite a nota do primeiro Bimestre");
            double notasPrimeiroBim = sc.nextDouble();
            System.out.println("Digite a nota do segundo Bimestre");
            double notasSegundoBim = sc.nextDouble();
            sc.nextLine();
            alunos[i] = new Aluno(nome, notasPrimeiroBim, notasSegundoBim);
        }
        sc.close();
        for (int i = 0; i < quantidadeAlunos; i++) {
            if(alunos[i].media()> 6){
                System.out.println("Aluno: " + alunos[i].getNome() + " APROVADO, média: " + alunos[i].media());
            }else{
                System.out.println("Aluno: " + alunos[i].getNome() + " REPROVADO, média: " + alunos[i].media());
            }
        }
    }
}