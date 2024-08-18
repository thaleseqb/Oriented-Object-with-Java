package br.com.individual_learn.screenmatch.main;

import br.com.individual_learn.screenmatch.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainApiSearcher {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Write the movie name that you want to know about ");
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();
        System.out.println("the movie name chosen was: " + movieName);

        String address = "http://www.omdbapi.com/?t=" + movieName + "&apikey=70066399";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Title title = gson.fromJson(json, Title.class);
        System.out.println(title);
    }
}
