package poo;

public enum EstadoBrasileiro {
    PIAUI ("PIAUI", "PI"),
    MARANHAO ("MARANHAO", "MA"),
    SAO_PAULO ("SAO PAULO", "SP"),
    RIO_JANEIRO ("RIO DE JANEIRO", "RJ");

    private String nome;
    private String sigla;
    
    private EstadoBrasileiro (String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
