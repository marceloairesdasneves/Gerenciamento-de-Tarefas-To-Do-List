package poo;

public class CalcularDescontoProduto {
    public static void main(String[] args){
        ProdutoX pdDesconto = new ProdutoX("TV", 1000);

        System.out.printf(" O produto %s seu valor original $ %.2f com o ",
                pdDesconto.getNome(),
                pdDesconto.getPreco());
                pdDesconto.desconto(10);
    }
}
