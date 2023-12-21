package com.example.fanztask.models;

public class Match {
    private Float rate;
    private int firstTeamLogoId;
    private int secondTeamLogoId;
    private int firstTeamScore;
    private int secondTeamScore;
    private String firstTeamName;
    private String secondTeamName;

    public Match(Float rate, int firstTeamLogoId, int secondTeamLogoId, int firstTeamScore, int secondTeamScore, String firstTeamName, String secondTeamName) {
        this.rate = rate;
        this.firstTeamLogoId = firstTeamLogoId;
        this.secondTeamLogoId = secondTeamLogoId;
        this.firstTeamScore = firstTeamScore;
        this.secondTeamScore = secondTeamScore;
        this.firstTeamName = firstTeamName;
        this.secondTeamName = secondTeamName;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public int getFirstTeamLogoId() {
        return firstTeamLogoId;
    }

    public void setFirstTeamLogoId(int firstTeamLogoId) {
        this.firstTeamLogoId = firstTeamLogoId;
    }

    public int getSecondTeamLogoId() {
        return secondTeamLogoId;
    }

    public void setSecondTeamLogoId(int secondTeamLogoId) {
        this.secondTeamLogoId = secondTeamLogoId;
    }

    public int getFirstTeamScore() {
        return firstTeamScore;
    }

    public void setFirstTeamScore(int firstTeamScore) {
        this.firstTeamScore = firstTeamScore;
    }

    public int getSecondTeamScore() {
        return secondTeamScore;
    }

    public void setSecondTeamScore(int secondTeamScore) {
        this.secondTeamScore = secondTeamScore;
    }

    public String getFirstTeamName() {
        return firstTeamName;
    }

    public void setFirstTeamName(String firstTeamName) {
        this.firstTeamName = firstTeamName;
    }

    public String getSecondTeamName() {
        return secondTeamName;
    }

    public void setSecondTeamName(String secondTeamName) {
        this.secondTeamName = secondTeamName;
    }
}
