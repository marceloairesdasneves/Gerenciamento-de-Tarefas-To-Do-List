package br.com.br.heranca;

public class Desenvolvedor extends Funcionario {
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("Desenvolvedor %s salario %.2f - Stack %s ", nome, salario, stack);
    }

    @Override
    public void calcularPLR() {
        System.out.println("\nPLR do desenvolverdor. ");
    }
}
