package entities;

public class Conta {
    private int numConta;
    private String titular;
    private double saldo;

    //Construtores
    public Conta() {
    }
    public Conta(int numConta, String titular, double depositoInicial) {
        this.numConta = numConta;
        this.titular = titular;
        deposito(depositoInicial);//Caso seja modificado o metodo de deposito esta linha nao precisara ser alterada
    }
    public Conta(int numConta, String titular) {
        this.titular = titular;
        this.numConta = numConta;
    }
    //Getters e Setters
    public int getNumConta() {
        return numConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    //Metodos
    public void deposito(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= (valor + 5);
    }

    @Override
    public String toString() {
        return "Conta "
                + numConta
                + ", Titular: "
                + titular
                + String.format("\n\tSaldo: R$ %.2f", saldo);
    }
}