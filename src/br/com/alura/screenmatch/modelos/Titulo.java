package br.com.alura.screenmatch.modelos;

<<<<<<< HEAD
=======
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
>>>>>>> 8be25bfb6d7cb0a91cddf8be30ba9acb0fae4b79
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        //esta vindo como string , pq minutos vem as vezes 60min
        this.nome=meuTituloOmdb.title();

        //se o tamaho da tring de ano for maior q 4 vou fazer isso
        if (meuTituloOmdb.year().length()>4){
            //estou passando esse problemas q tem esses detalhes
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano" +
                    "porque tem mais de 04 caracters");
        }
        //pega o meu ano, do jeito   veio, e tenta fazer isso um inteiro
        this.anoDeLancamento=Integer.valueOf(meuTituloOmdb.year());
        //da onde q começa e da onde q termina - substring()
        this.duracaoEmMinutos=Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));

    }


    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " +nome);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento ;
=======

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + " , " +
                "Duracção "+ duracaoEmMinutos;
>>>>>>> 8be25bfb6d7cb0a91cddf8be30ba9acb0fae4b79
    }
}




