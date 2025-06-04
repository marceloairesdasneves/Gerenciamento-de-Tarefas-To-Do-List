package br.com.alura.banco;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal cobrada de " + tarifaMensal + " e o valor do saldo atual de " + saldo);
    }

}
