package br.com.individual_learn.screenmatch.models;

import br.com.individual_learn.screenmatch.calculator.Classification;

public class Movie extends Title implements Classification {
    private String director;

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
}
