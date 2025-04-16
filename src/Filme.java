public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
        System.out.println("Incluido no Plano: " + incluidoNoPlano);
    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

}
