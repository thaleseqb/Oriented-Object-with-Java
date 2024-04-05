import br.com.individual_learn.screenmatch.models.Movie;

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
    }
}
