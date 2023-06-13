package org.example;

public class Aluno {

    String nome;
    double notaPrimeiroBim;
    double notaSegundoBim;

    public Aluno(String nome, double notaPrimeiroBim, double notaSegundoBim) {
        this.nome = nome;
        this.notaPrimeiroBim = notaPrimeiroBim;
        this.notaSegundoBim = notaSegundoBim;
    }

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
        return (notaPrimeiroBim + notaSegundoBim)/2;
    }
}
