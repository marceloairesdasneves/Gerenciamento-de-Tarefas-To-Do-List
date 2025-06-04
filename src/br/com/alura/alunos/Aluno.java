package br.com.alura.alunos;

public class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirInfo() {
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.2f \n", getNome(), getIdade(), nota );
    }
}
