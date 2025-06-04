
public class Revista extends Midia {

    private String edicao;

    public Revista(String titulo, int anoDePublicacao, String edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    public void geraCodigo() {
        // Implementação do método para gerar código específico para revistas
        System.out.println("Codigo: LIB-" + titulo.substring(0, 3) + anoDePublicacao + " | Revista: " + titulo + " - Edicao: " + edicao);
    }
    
}
