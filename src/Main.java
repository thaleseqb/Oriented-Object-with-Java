import br.com.individual_learn.screenmatch.calculator.TimeCalculator;
import br.com.individual_learn.screenmatch.models.Movie;
import br.com.individual_learn.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Up altas aventuras");
        myMovie.setTimeInMinutes(180);

        myMovie.exhibitDescription();
        myMovie.avaliation(8);
        myMovie.avaliation(8);
        myMovie.avaliation(10);

        System.out.println("The total number of avaliations: " + myMovie.getTotalAvaliations());
        System.out.println("Mean: " + myMovie.getMean());


        Serie serie = new Serie();

        serie.setName("lost in the paradise");
        serie.setLaunchingYear(2000);
        serie.setSeasons(10);
        serie.setEpisodeMinutes(50);
        serie.setSeansonEpsiodes(10);
        serie.exhibitDescription();

        Movie otherMovie = new Movie();
        otherMovie.setName("Indiana Jones");
        otherMovie.setTimeInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.insert(myMovie);
        calculator.insert(otherMovie);
        calculator.insert(serie);

        System.out.println(calculator.getTotalTime());
    }
}
