package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
private  int temporadas;
private boolean ativa;
private int episodiosPorTemporada;
private int minutosPrEpisodio;
private int totalVizualizacoes;


//construtor
    public Serie(int anoDeLancamento, String nome) {
        super(anoDeLancamento, nome);
    }

    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }

    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPrEpisodio() {
        return minutosPrEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPrEpisodio) {
        this.minutosPrEpisodio = minutosPrEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return super.getDuracaoEmMinutos();
    }

    @Override
    public int getClassificacao() {
        if (totalVizualizacoes > 100) {
            return 4;
            //estrelas
        } else {
            //estrelas
            return 2;
        }
    }

    @Override
    public String toString() {
        return "Serie: "+  this.getNome()+" ("+this.getAnoDeLancamento()+") ";
    }
}
