package poo;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome, Object o) {
    }


    void mensagem(){
        System.out.printf("Olá, Mundi, como está %s ", nome);
    }
}