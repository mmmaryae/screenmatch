package br.com.alura.screenmatch.Principal;

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
        String endereco="https://www.omdbapi.com/?t="+busca+"&apikey=c29ddfa1";
        //faz a solicitação
        HttpClient client = HttpClient.newHttpClient();
        //devolve a requisição
        HttpRequest request=HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        //receber a resposta do client
        HttpResponse<String> response=client
                .send(request, HttpResponse.BodyHandlers.ofString());
        //corpo da resposta
        System.out.println(response.body());



    }
}
