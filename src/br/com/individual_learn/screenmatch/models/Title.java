package br.com.individual_learn.screenmatch.models;

public class Title implements Comparable<Title>{
    private String name;
    private int launchingYear;
    private boolean isIncluded;
    private double avaliationSum;
    private int totalAvaliations;
    private int timeInMinutes;

    public Title(String name, int launchingYear) {
        this.name = name;
        this.launchingYear = launchingYear;
    }

    public int getTotalAvaliations() {
        return totalAvaliations;
    }

    public String getName() {
        return name;
    }

    public int getLaunchingYear() {
        return launchingYear;
    }

    public boolean isIncluded() {
        return isIncluded;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public void setLaunchingYear(int launchingYear) {
        this.launchingYear = launchingYear;
    }

    public void setIncluded(boolean included) {
        isIncluded = included;
    }

    public void exhibitDescription() {
        System.out.println("Name's movie: " + name);
        System.out.println("Launching year: " + launchingYear);
        System.out.println("avaliation: " + avaliationSum);
        System.out.println("time in minutes: " + timeInMinutes);
    }

    public void avaliation(double av) {
        avaliationSum += av;
        totalAvaliations++;
    }

    public double getMean() {
        return avaliationSum / totalAvaliations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
