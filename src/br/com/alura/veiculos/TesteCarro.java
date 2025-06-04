package br.com.alura.veiculos;

public class TesteCarro{
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.nomeModelo("Sedan");
        carro.definirPreco(35000,45000,89000);
        carro.exibirInfo();
        carro.setTipoDoCarro("Paraty");
        System.out.println("Tipo do carro: " + carro.getTipoDoCarro());
    }
}
