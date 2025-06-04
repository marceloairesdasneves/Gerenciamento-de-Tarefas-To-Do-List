package br.com.br.heranca;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes(){
        System.out.printf("\nO funcionario %s tem o salario de %.2f ", nome, salario);
    }

    public void reajusteSalario(double percentual){

        salario += salario * (percentual / 100);
        System.out.printf("\nNovo salario de %s e %.2f ", nome, salario);
    }

    public void reajusteSalario(){
        salario += 500;
        System.out.printf("\nNovo salario do empregado %s foi reajustado com o valor para %.2f ", nome, salario);
    }

    public abstract void calcularPLR();



}
