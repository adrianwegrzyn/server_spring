package com.example.demo.pdf;



public class Exercise {
    private String name;
    private int numberSeries;
    private String repeats;
    private int time;

    public Exercise() {
    }

    public Exercise( String name, int numberSeries, String repeats) {

        this.name = name;
        this.numberSeries = numberSeries;
        this.repeats = repeats;
    }

    public Exercise( String name, int time) {
        this.name = name;
        this.time = time;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberSeries() {
        return numberSeries;
    }

    public void setNumberSeries(int numberSeries) {
        this.numberSeries = numberSeries;
    }

    public String getRepeats() {
        return repeats;
    }

    public void setRepeats(String repeats) {
        this.repeats = repeats;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
