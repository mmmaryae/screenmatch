package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel) {
/*
   Estamos dizendo que, quando chamarmos o FiltroRecomendação e mandarmos filtrar,
   ele buscará a classificação dentro da entidade(filme,serie ou epsodio) que implementou o Classificavel,
   olhará as estrelas, e retornará a mensagem correspondente.

   REFERENCIA:
   Classificavel classifical
👉 NÃO é uma classe específica
👉 É tipo falar:

“me passa QUALQUER coisa que seja classificável”

 E quem é classificável no seu código?
Filme ✅
Serie ✅
Episodio ✅

👉 porque todos têm:

implements Classificavel

............................
o parametro 'classificavel' vai receber o resultado do 'return' de
cada classe q o implementou o getClassificao
ele recebe o numero e faz a validacao de qual mensagem será exibida quando chmarem o metodo filtra
*/



        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");


        }

    }
}