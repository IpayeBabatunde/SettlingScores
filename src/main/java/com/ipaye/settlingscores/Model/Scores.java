package com.ipaye.settlingscores.Model;

public class Scores {

    public int wins;
    public int ties;
    public int losses;

    // constructors
    public Scores(int wins, int ties, int losses) {
        this.wins=wins;
        this.ties=ties;
        this.losses=losses;
    }

    // getters & setters
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins=wins;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties=ties;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses=losses;
    }
}
