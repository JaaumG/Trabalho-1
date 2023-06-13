package org.example;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos alunos terão suas médias calculadas:");
        int quantidadeAlunos = sc.nextInt();
        sc.nextLine();
        String[] nomes = new String[quantidadeAlunos];
        Double[] notasPrimeiroBim = new Double[quantidadeAlunos];
        Double[] notasSegundoBim = new Double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno 1:");
            nomes[i] = sc.nextLine();
            System.out.println("Digite a nota do primeiro Bimestre");
            notasPrimeiroBim[i] = sc.nextDouble();
            System.out.println("Digite a nota do segundo Bimestre");
            notasSegundoBim[i] = sc.nextDouble();
            sc.nextLine();
        }
        sc.close();
        for (int i = 0; i < quantidadeAlunos; i++) {
            double media = (notasPrimeiroBim[i] + notasSegundoBim[i])/2;
            if(media> 6){
                System.out.println("Aluno: " + nomes[i] + " APROVADO, média: " + media);
            }else{
                System.out.println("Aluno: " + nomes[i] + " REPROVADO, média: " + media);
            }
        }
    }
}