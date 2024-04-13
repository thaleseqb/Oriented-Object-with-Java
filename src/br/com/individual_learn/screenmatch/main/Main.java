package br.com.individual_learn.screenmatch.main;

import br.com.individual_learn.screenmatch.calculator.RecomendationsFilter;
import br.com.individual_learn.screenmatch.calculator.TimeCalculator;
import br.com.individual_learn.screenmatch.models.Episode;
import br.com.individual_learn.screenmatch.models.Movie;
import br.com.individual_learn.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Up altas aventuras", 1800);
        myMovie.setTimeInMinutes(180);

        myMovie.exhibitDescription();
        myMovie.avaliation(8);
        myMovie.avaliation(8);
        myMovie.avaliation(10);

        System.out.println("The total number of avaliations: " + myMovie.getTotalAvaliations());
        System.out.println("Mean: " + myMovie.getMean());


        Serie serie = new Serie("Lost", 2000);

        serie.setSeasons(10);
        serie.setEpisodeMinutes(50);
        serie.setSeansonEpsiodes(10);
        serie.exhibitDescription();

        Movie otherMovie = new Movie("Indiana Jones", 1900);
        otherMovie.setTimeInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.insert(myMovie);
        calculator.insert(otherMovie);
        calculator.insert(serie);

        System.out.println(calculator.getTotalTime());

        RecomendationsFilter filter = new RecomendationsFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumberEpisode(1);
        episode.setSerie(serie);
        episode.setTotalViews(300);

        filter.filter(episode);

        Movie jaqsMovie = new Movie("O jogo da imitação",2011);
        jaqsMovie.setTimeInMinutes(200);
        jaqsMovie.avaliation(10);


        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(jaqsMovie);
        movieList.add(myMovie);
        movieList.add(otherMovie);

        System.out.println("Tamanho da lista: "+ movieList.size());
        System.out.println("Primeiro filme: " + movieList.get(0).getName());
        System.out.println("toString filme: " + movieList.get(0).toString());

        System.out.println("Imprima toda a lista: " + movieList);


    }
}
