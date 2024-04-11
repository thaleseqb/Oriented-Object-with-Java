package br.com.individual_learn.screenmatch.models;

import br.com.individual_learn.screenmatch.calculator.Classification;

public class Episode implements Classification {
    private int numberEpisode;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getNumberEpisode() {
        return numberEpisode;
    }

    public void setNumberEpisode(int numberEpisode) {
        this.numberEpisode = numberEpisode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
