package entities;

public class Employee {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }
    public void salarioAumento(double percentage){
        salarioBruto += salarioBruto * percentage/100;

    }
    public String toString(){
        return nome+", "+salarioLiquido();

    }

}
