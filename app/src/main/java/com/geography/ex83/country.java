package com.geography.ex83;

public class country {
    String name;
    String capital;
    int population;
    String language;
    String anthem;

    public country(String name, String capital, int population, String language, String anthem) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.language = language;
        this.anthem = anthem;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulation() {
        return population;
    }

    public String getLanguage() {
        return language;
    }

    public String getAnthem() {
        return anthem;
    }

    public void setName(String name) {
        this.name = name;
    }


}
