
public class PrincipalMidia {   
    public static void main(String[] args) {
        // Replace 'Livro' with a concrete subclass, e.g., 'LivroFisico'
        Livro livro = new Livro("Dom Casmurro", 1899, "Machado de Assis", "Romance");
        livro.geraCodigo();
        
        Revista revista = new Revista("Superinteressante", 2023, "Edição Especial");
        revista.geraCodigo();
        
        Ebook ebook = new Ebook("Java para Iniciantes", 2022, "PDF");
        ebook.geraCodigo();
    }
}
