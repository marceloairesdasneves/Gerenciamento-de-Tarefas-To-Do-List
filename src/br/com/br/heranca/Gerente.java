package br.com.br.heranca;

public class Gerente extends Funcionario implements Aprovador {
    private double bonus;


    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nGerente: %s - salario %.2f - bonus: %.2f ", nome, salario, bonus);
    }

    @Override
    public void calcularPLR() {
        System.out.println("\nPLR do gerente.");
    }

    @Override
    public void aprovarProjeto(String nomeProjeto) {
        System.out.printf("Gerente(a) %s aprova projeto ", nome, nomeProjeto );
    }
}
