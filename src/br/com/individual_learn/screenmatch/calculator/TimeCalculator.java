package br.com.individual_learn.screenmatch.calculator;
import br.com.individual_learn.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    it is not interesting to repeat methods for different classes
//    public void insert(Movie movie) {
//        totalTime += movie.getTimeInMinutes();
//    }

//    public void insert(Series movie) {
//        totalTime += movie.getTimeInMinutes();
//    }

    public void insert(Title title) {
        totalTime += title.getTimeInMinutes();
    }
}
