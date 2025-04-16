package poo;

public class CalculaDobro {
    public static void main(String[] args) {
        Calculadora dobroDoNumero = new Calculadora();
        dobroDoNumero.recebeNumero = 20;
        System.out.println(dobroDoNumero.dobro(dobroDoNumero.recebeNumero));
        //System.out.println(dobroDoNumero.dobro(15));

    }
}
