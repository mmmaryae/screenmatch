package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(1970,"O poderoso chefão");
        meuFilme.avalia(9);
        Filme outroFilme = new Filme(2023,"Avatar");
        outroFilme.avalia(6);
        Serie lost = new Serie(2000,"Lost");

        var filmeDoPaulo=new Filme(2003,"Dogville");
        filmeDoPaulo.avalia(10);

        List<Titulo> lista =new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item:lista){
            System.out.println(item);
            //Já pergunta se é e já declara e verificações tbm
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println("Classificação"+filme.getClassificacao());
            }
        }

        ArrayList<String>buscaPorArtista=new ArrayList<>();
        buscaPorArtista.add("Adam sendler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);




    }


}
