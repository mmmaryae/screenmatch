package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
private String diretor;

    public Filme(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }



    @Override
    /*
    Vai ser calculado assim:

Notas: 10, 8, 6
Média: 8.0
(int) → 8
8 / 2 → 4
     */
    public int getClassificacao() {

        return (int) pegaMedia()/2;
    }


    @Override
    public String toString() {
        return "Filme: "+ this.getNome()+" ("+this.getAnoDeLancamento()+") ";


    }


}