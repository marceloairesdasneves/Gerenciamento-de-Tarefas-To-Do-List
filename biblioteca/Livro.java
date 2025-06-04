
public class Livro extends Midia {
    private String autor;
    private String genero;

    public Livro(String titulo, int anoDePublicacao, String autor, String genero) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
        this.genero = genero;
    }

    public void geraCodigo() {
        // Implementação do método para gerar código específico para livros
        System.out.println("Codigo: LIB-" + autor.substring(0, 3) + anoDePublicacao + " | Livro: " + titulo + " - Genero: " + genero );
    }



    
}
