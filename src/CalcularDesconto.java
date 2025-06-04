public class CalcularDesconto {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.0);

        System.out.println("O produto " + produto.getNome() + " custa " + produto.getPreco());
        produto.aplicarDesconto(10);
    }
}
