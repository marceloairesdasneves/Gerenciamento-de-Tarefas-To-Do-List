package br.com.alura.moedas;

public class ConversorMoeda  implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolarEmReais = 5.0;
        double valorReal = valorDolar * cotacaoDolarEmReais;

        System.out.printf("O valor de R$ %.2f reais.", valorReal);


    }
}
