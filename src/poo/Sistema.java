package poo;

public class Sistema {
    public static void main (String[] arg){
        Venda venda1 = new Venda();
        venda1.produto = "Camiseta";
        venda1.quantidade = 2;
        venda1.valorUnitario = 25.25;

        System.out.printf("O valor total da venda: $ %.2f ", venda1.valorUnitario * venda1.quantidade);
    }
}
