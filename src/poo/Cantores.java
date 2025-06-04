package poo;

public class Cantores {
    public static void main(String[] args) {
        Musica musico = new Musica();

        musico.titulo = "Titulo1";
        musico.nomeDocompositor = "Artista1";
        musico.anoDeLancamento = 1990;

        musico.exibirFichaTecnica();
        musico.avaliarMusica(8);
        musico.avaliarMusica(2);

        System.out.printf("\nA media da avaliacao do Artista foi %.2f  com um total de %d avaliadores. \n", musico.calcularMediaDeAvaliacoes(), musico.numeroDeAvaliacao);


    }
}
