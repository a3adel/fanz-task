package com.example.fanztask.models;

import java.util.ArrayList;

public class SportDay {
    private String date;
    private ArrayList<Match> matches;


    public SportDay(String date, ArrayList<Match> matches) {
        this.date = date;
        this.matches = matches;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Match> getMatches() {
        if(matches==null)
            matches=new ArrayList<>();
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }
}
