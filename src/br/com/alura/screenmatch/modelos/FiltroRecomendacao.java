package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculo.Classificavel;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado.");
        }
        else {
            System.out.println("Coloque na sua lista para assistir.");
        }
    }
}
