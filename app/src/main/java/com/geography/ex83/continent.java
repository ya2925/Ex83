package com.geography.ex83;

public class continent {
    String name;
    country countries[];
    String countriesString[];

    public continent(String name) {
        this.name = name;
    }

    public void setCountries(country countries[]) {
        this.countries = countries;
    }
    public void setCountriesString(String countriesString[]) {
        this.countriesString = countriesString;
    }
    public String[] getCountriesString() {
        return countriesString;
    }

    public String getName() {
        return name;
    }

    public country[] getCountries() {
        return countries;
    }

}
