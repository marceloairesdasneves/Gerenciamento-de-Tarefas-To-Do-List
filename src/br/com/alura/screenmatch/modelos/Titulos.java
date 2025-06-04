package br.com.alura.screenmatch.modelos;
import static java.lang.System.*;

public class Titulos {
        private String nome;
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliacoes;
        private int totalDeAvaliacao;
        private int duracaoEmMinutos;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }
        public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }
        public boolean getIncluidoNoPlano() {
            return incluidoNoPlano;
        }
        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }
        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }
        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }
        public int getTotalDeAvaliacao(){
            return totalDeAvaliacao;
        }
        public void exibeFichaTecnica(){
            out.println("Nome do filme: " + nome);
            out.println("Ano de Lancamento: " + anoDeLancamento);
            out.println("Duracao em minutos: " + duracaoEmMinutos);
            out.println("Incluido no Plano: " + incluidoNoPlano);
        }
        public void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacao++;
        }
        public double pegaMedia(){
            return somaDasAvaliacoes / totalDeAvaliacao;
        }
}
