package br.com.alura.mamiferos;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au.");;
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo de felicidade.");
    }
}
