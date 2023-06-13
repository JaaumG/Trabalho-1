package org.example;

public class Aluno {

    //Atributos do aluno

    private String nome;
    private double notaPrimeiroBim;
    private double notaSegundoBim;

    //Construtor da classe aluno
    public Aluno(String nome, double notaPrimeiroBim, double notaSegundoBim) {
        this.nome = nome;
        this.notaPrimeiroBim = notaPrimeiroBim;
        this.notaSegundoBim = notaSegundoBim;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaPrimeiroBim() {
        return notaPrimeiroBim;
    }

    public void setNotaPrimeiroBim(double notaPrimeiroBim) {
        this.notaPrimeiroBim = notaPrimeiroBim;
    }

    public double getNotaSegundoBim() {
        return notaSegundoBim;
    }

    public void setNotaSegundoBim(double notaSegundoBim) {
        this.notaSegundoBim = notaSegundoBim;
    }

    public double media(){
        //Metodo publico de aluno no qual retorna a sua media
        return (notaPrimeiroBim + notaSegundoBim)/2;
    }
}
