package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca=sc.nextLine();
        String endereco="https://www.omdbapi.com/?t="+busca.replace(" ", "+")+"&apikey=c29ddfa1";
        //faz a solicitação
        try{
        HttpClient client = HttpClient.newHttpClient();
        //devolve a requisição --
        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        //receber a resposta do client
        HttpResponse<String> response=client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //corpo da resposta
        String json =response.body();

        System.out.println(json);

        //declarando o gson-biblioteca q transforma json em objetos java
        Gson gson=new GsonBuilder()

                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //transformar em objetos -gson.fromJson
        //Titulo meuTitulo=gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb=gson.fromJson(json, TituloOmdb.class);

        System.out.println(meuTituloOmdb);


            Titulo meutitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo já convertido");
            System.out.println(meutitulo);

        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço ");
        }
        //exceção generica
        catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());

        }





    }
}
