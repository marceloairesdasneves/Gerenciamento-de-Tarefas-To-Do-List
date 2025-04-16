public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();
        favorito.nome = "O poderoso chefao";
        favorito.anoDeLancamento = 1970;
        favorito.duracaoEmMinutos = 180;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(8);
        favorito.avalia(5);
        favorito.avalia(10);

        System.out.printf("A media de avaliacoes: %.2f \n", favorito.pegaMedia());
        System.out.println("\n");

        Filme favorito2 = new Filme();
        favorito2.nome = "The Matrix";
        favorito2.anoDeLancamento = 1999;
        favorito2.duracaoEmMinutos = 135;
        favorito2.incluidoNoPlano = true;

        favorito2.exibeFichaTecnica();
        favorito2.avalia(9);
        favorito2.avalia(8);
        favorito2.avalia(9);

        System.out.printf("A media de avaliacoes: %.2f \n", favorito2.pegaMedia());

    }
}