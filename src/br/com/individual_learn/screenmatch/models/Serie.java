package br.com.individual_learn.screenmatch.models;

public class Serie extends Title{
    private int seasons;
    private boolean active;
    private int seansonEpsiodes;
    private int episodeMinutes;

    public Serie(String name, int launchingYear) {
        super(name, launchingYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getSeansonEpsiodes() {
        return seansonEpsiodes;
    }

    public void setSeansonEpsiodes(int seansonEpsiodes) {
        this.seansonEpsiodes = seansonEpsiodes;
    }

    public int getEpisodeMinutes() {
        return episodeMinutes;
    }

    public void setEpisodeMinutes(int episodeMinutes) {
        this.episodeMinutes = episodeMinutes;
    }

    @Override
    public int getTimeInMinutes() {
        return seasons*episodeMinutes*seansonEpsiodes;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + ": (" + this.getLaunchingYear() + ")";
    }
}
