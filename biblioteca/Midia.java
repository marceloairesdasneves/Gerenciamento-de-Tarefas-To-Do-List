public class Midia {
    protected String titulo;
    protected int anoDePublicacao;

    public Midia(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void geraCodigo() {
        // Implementação do método para gerar código
        System.out.println("Gerando código para a mídia: LIB-" + titulo + anoDePublicacao);
    }
    
}
