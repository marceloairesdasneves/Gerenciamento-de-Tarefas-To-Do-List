package br.com.alura.banco;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado. Saldo atual " + saldo);
    }

    public void sacar(double valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque no valor de " + valor + " saldo atualizado de " + saldo);
        }else {
            System.out.println("Saldo insuficiente. ");
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual de: " + saldo);
    }
}
