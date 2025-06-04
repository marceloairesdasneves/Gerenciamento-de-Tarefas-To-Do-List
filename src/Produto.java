public class Produto {
    private String nome;
    private double preco;

    public  Produto(String nome, double preco){
            this.nome = nome;
            this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void aplicarDesconto(double percentual){
        preco -= ((preco * percentual) / 100);
        System.out.println("O valor com desconto e de: " + preco);
    }
}
