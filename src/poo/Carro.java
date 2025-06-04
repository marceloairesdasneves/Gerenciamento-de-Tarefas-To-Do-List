package poo;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int anoAtual;

    void fichaTecnica(){
        System.out.println("O Modelo do Carro: " + modelo);
        System.out.println("Ano de Lancamento do Carro: " + ano);
        System.out.println("Cor: " + cor);
    }

    int idadeDoCarro(int _anoAtual){
        return _anoAtual - ano;
    }
}
