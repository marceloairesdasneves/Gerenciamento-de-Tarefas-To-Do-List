
public class Ebook extends Midia {

    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
        }

    public void geraCodigo() {
        String titulo = null;
        // Implementação do método para gerar código específico para Ebook
        System.out.println("Codigo: LIB-" + this.titulo.substring(0, 3) + anoDePublicacao + " | Ebook: " + this.titulo + " - " + "Formato: " + formato);
    }



    
}
