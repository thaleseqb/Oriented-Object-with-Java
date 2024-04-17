package br.com.individual_learn.screenmatch.main;

import br.com.individual_learn.screenmatch.models.Movie;
import br.com.individual_learn.screenmatch.models.Serie;
import br.com.individual_learn.screenmatch.models.Title;

import java.util.*;

public class MainLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Up altas aventuras", 1800);
        myMovie.avaliation(9);
        Movie otherMovie = new Movie("Indiana Jones", 1900);
        otherMovie.avaliation(10);
        Movie jaqsMovie = new Movie("O jogo da imitação",2011);
        jaqsMovie.avaliation(8);
        Serie serie = new Serie("Lost", 2000);

        ArrayList<Title> list = new ArrayList<>();
        list.add(jaqsMovie);
        list.add(myMovie);
        list.add(otherMovie);
        list.add(serie);

        for (Title title : list) {
            if (title instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("The classification is: " + movie.getClassification());
            }
        }

        List<String> trackArtist = new LinkedList<>();
        trackArtist.add("Adam Sandler");
        trackArtist.add("Andre");
        trackArtist.add("Milton");
        trackArtist.add("Cecília");

        System.out.println(trackArtist);
//        this method sorts the array
        Collections.sort(trackArtist);

        System.out.println(trackArtist);

        Collections.sort(list);
        System.out.println(list);

        list.sort(Comparator.comparing(Title::getLaunchingYear));
        System.out.println(list);
    }
}
