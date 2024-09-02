package br.com.individual_learn.screenmatch.main;

import br.com.individual_learn.screenmatch.models.OMDBTitle;
import br.com.individual_learn.screenmatch.models.Title;
import br.com.individual_learn.screenmatch.my_exceptions.ParsingErrorException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApiSearcher {
    public static void main(String[] args) throws IOException, InterruptedException {

        boolean finished = false;
        ArrayList<String> array = new ArrayList<>();
        String movieName;

        while (!finished) {
            System.out.println("Write the movie name that you want to know about ");
            System.out.println("or press q to quit the program");
            Scanner scan = new Scanner(System.in);

            movieName = scan.nextLine();

            if (movieName.equals("q")) {
                finished = true;
                continue;
            }
            System.out.println("the movie name chosen was: " + movieName);
            array.add(movieName);
        }

        for (int idx = 0; idx < array.size(); idx++) {
            String address = "http://www.omdbapi.com/?t=" + array.get(idx).replace(" ", "+")
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
                FileWriter writer = new FileWriter("movies.txt");
                writer.write(title.toString());
                writer.close();

            } catch (NumberFormatException exception) {
                System.out.println("An error occurred");
                System.out.println(exception.getMessage());

            } catch (IllegalArgumentException exception) {
                System.out.println("An argument error occurred while searching for the movie");
            } catch (ParsingErrorException exception) {
                System.out.println(exception.getMessage());
            }
        }



        System.out.println("program finished correctly");
    }
}
