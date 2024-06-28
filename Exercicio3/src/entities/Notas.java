package entities;

public class Notas {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media = 60;

    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }
    public String Aprovado(){
        if(finalGrade()>=media){return "Aprovado";}
        else{return "Reprovado";}
    }
    public double faltando(){
        return media-finalGrade();
    }
}
