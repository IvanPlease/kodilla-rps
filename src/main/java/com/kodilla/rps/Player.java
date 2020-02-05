package com.kodilla.rps;

public abstract class Player{

    private String name;
    private int points = 0;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void addPoint(){
        points++;
    }

    public abstract int getMove();

}
