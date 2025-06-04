package br.com.br.heranca;

public class Principal {
   public static void main(String[] args) {
       System.out.println("\n********************************");

       Funcionario gerente = new Gerente("Maria", 30000);
       ((Gerente) gerente).setBonus(5000);
       gerente.exibirInformacoes();
       gerente.reajusteSalario(10);
       gerente.calcularPLR();
       ((Gerente) gerente).aprovarProjeto("JAVA");

       System.out.println("\n********************************");

       Funcionario desenvolvedor = new Desenvolvedor("Carlos", 12000, "Backend");
       desenvolvedor.exibirInformacoes();
       desenvolvedor.reajusteSalario();
       desenvolvedor.calcularPLR();
       //desenvolvedor.aprovarProjeto("JavaScript");
       System.out.println("\n********************************");


   }
}
