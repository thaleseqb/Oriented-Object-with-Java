package br.com.individual_learn.screenmatch.main;

import br.com.individual_learn.screenmatch.models.OMDBTitle;
import br.com.individual_learn.screenmatch.models.Title;
import br.com.individual_learn.screenmatch.my_exceptions.ParsingErrorException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String address = "http://www.omdbapi.com/?t=" + movieName.replace(" ", "+")
                + "&apikey=70066399";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(
                            FieldNamingPolicy.UPPER_CAMEL_CASE
                    ).create();
            OMDBTitle omdbtitle = gson.fromJson(json, OMDBTitle.class);

            Title title = new Title(omdbtitle);
            System.out.println("omdb title " + omdbtitle);
            System.out.println("my title " + title);

        } catch (NumberFormatException exception) {
            System.out.println("An error occurred");
            System.out.println(exception.getMessage());
        } catch (IllegalArgumentException exception) {
            System.out.println("An argument error occurred while searching for the movie");
        } catch (ParsingErrorException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("program finished correctly");
    }
}
