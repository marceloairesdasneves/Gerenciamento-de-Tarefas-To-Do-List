package poo;

public class Conta {
    private double salvo;
    private double saldo;


    private void scar(double valor) {
        salvo -= valor;
    }

    double getSalvo(){
        return  saldo;
    }
}