package br.com.alura.screenmatch.modelos.calculo;

import br.com.alura.screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Series s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Titulos titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
