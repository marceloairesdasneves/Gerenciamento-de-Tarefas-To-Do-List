package poo;

public class ProdutoX {
    private String nome;
    private double preco;

    //Construtor

    public ProdutoX(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }
    //criar os getter and setter.
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void desconto(double percentual){
        preco -= (preco * percentual)/100;
        System.out.printf("desconto %.2f %% = $ %.2f ", percentual, preco);
    }
}
