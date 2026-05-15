package br.com.alura.screenmatch.modelos;

public record TituloOmdb(String title, String year, String runtime) {
    //class especial, em baixo dos panos ela já tem implementado getters and setters toString
}
