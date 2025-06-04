package poo;

public class Musica {

    //atributos e caracteristicas
    String titulo;
    String nomeDocompositor;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numeroDeAvaliacao;


    //metodos
    void exibirFichaTecnica(){
        System.out.println("Titulo da Musica: " + titulo);
        System.out.println("Nome do compositor: " + nomeDocompositor);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avaliarMusica(double nota){
        somaDasAvaliacoes += nota;
        numeroDeAvaliacao++;
    }

    double calcularMediaDeAvaliacoes(){
        return somaDasAvaliacoes / numeroDeAvaliacao;
    }
}
