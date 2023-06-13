package org.example;


import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in); //Iniciando o scanner
        System.out.println("Digite quantos alunos terão suas médias calculadas:");
        int quantidadeAlunos = sc.nextInt(); //lendo quantidade de alunos
        sc.nextLine(); //Lendo linha "bugada" por ter utilizado o next int préviamente.
        String[] nomes = new String[quantidadeAlunos]; //Alocação de um vetor com os nomes
        Double[] notasPrimeiroBim = new Double[quantidadeAlunos]; //Alocação de um vetor com as notas do primeiro Bimestre
        Double[] notasSegundoBim = new Double[quantidadeAlunos]; //Alocação de um vetor com as notas do segundo Bimestre
        for (int i = 0; i < quantidadeAlunos; i++) { //Loop para ler cada aluno
            System.out.println("Digite o nome do aluno "+(i+1)+":"); //Imprimindo "Digite o nome do aluno" concatenando com o valor de i + 1 e concatenando com ":"
            nomes[i] = sc.nextLine(); //Guardando as informações na posição i do vetor de nomes
            System.out.println("Digite a nota do primeiro Bimestre");
            notasPrimeiroBim[i] = sc.nextDouble(); //Guardando a informação de nota do primeiro bim na posição i do vetor de notas do primeiro bimestre
            System.out.println("Digite a nota do segundo Bimestre");
            notasSegundoBim[i] = sc.nextDouble();  //Guardando a informação de nota do segundo bim na posição i do vetor de notas do segundo bimestre
            sc.nextLine();//Lendo linha "bugada" por ter utilizado o next double préviamente.
        }
        sc.close(); //Fechamento do scanner
        for (int i = 0; i < quantidadeAlunos; i++) { //Loop para imprimir cada aluno
            double media = (notasPrimeiroBim[i] + notasSegundoBim[i])/2; //calculo da média (a + b + c + ... + n)/(quantidade de notas)
            if(media>= 6){ //Verificando se média é maior ou igual 6
                System.out.println("Aluno: " + nomes[i] + " APROVADO, média: " + media); 
                //Caso for será impresso "Aluno: " concatenando com o valor do nome na posição i do vetor de nomes e concatenando com " APROVADO, média: "
                //e por fim concatenando com a media
            }else{
                System.out.println("Aluno: " + nomes[i] + " REPROVADO, média: " + media);
                //Caso contrario será impresso "Aluno: " concatenando com o valor do nome na posição i do vetor de nomes e concatenando com " REPROVADO, média: "
                //e por fim concatenando com a media
            }
        }
    }
}