package com.example.myapplication;

public class King {
    // Variables that are used
    private String name;
    private int from, to;
    // Constructon
    public King(String name, int from, int to) {
        this.name = name;
        this.from = from;
        this.to = to;
    }
    // methods
    public String getName() {
        return name;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    // toString method that will return the value for each objet in the ListView container
    public String toString(){
        return name;
    }
}
