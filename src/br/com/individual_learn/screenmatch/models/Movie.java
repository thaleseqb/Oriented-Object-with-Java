package br.com.individual_learn.screenmatch.models;

import br.com.individual_learn.screenmatch.calculator.Classification;

public class Movie extends Title implements Classification {
    private String director;

//    this is the correct way of declaring a personalized constructor
    public Movie(String name, int lauchingYear) {
        super(name, lauchingYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int)getMean() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + ": (" + this.getLaunchingYear() + ")";
    }
}
