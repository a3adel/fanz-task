package com.example.fanztask.repo;

import com.example.fanztask.R;
import com.example.fanztask.models.Match;
import com.example.fanztask.models.SportDay;

import java.util.ArrayList;
import java.util.List;

public class FakeDataRepo implements DataRepo {
    @Override
    public List<SportDay> getSportDays() {

        ArrayList<SportDay> sportDays = new ArrayList<>();

        // Day 1: One match
        SportDay sportDay1 = new SportDay("Jan 1st", new ArrayList<>());
        sportDay1.getMatches().add(new Match(6.5f, R.drawable.ahly, R.drawable.zamalek, 3, 1, "Team A", "Team B"));
        sportDays.add(sportDay1);

        // Day 2: Four matches
        SportDay sportDay2 = new SportDay("Jan 2nd", new ArrayList<>());
        sportDay2.getMatches().add(new Match(2.0f, R.drawable.ahly, R.drawable.zamalek, 2, 2, "Team C", "Team D"));
        sportDay2.getMatches().add(new Match(5.8f, R.drawable.ahly, R.drawable.zamalek, 1, 0, "Team E", "Team F"));
        sportDay2.getMatches().add(new Match(3.9f, R.drawable.ahly, R.drawable.zamalek, 3, 3, "Team G", "Team H"));
        sportDay2.getMatches().add(new Match(7.2f, R.drawable.ahly, R.drawable.zamalek, 0, 1, "Team I", "Team J"));
        sportDays.add(sportDay2);

        // Day 3: Two matches
        SportDay sportDay3 = new SportDay("Jan 3rd", new ArrayList<>());
        sportDay3.getMatches().add(new Match(2.5f, R.drawable.ahly, R.drawable.zamalek, 2, 1, "Team K", "Team L"));
        sportDay3.getMatches().add(new Match(2.1f, R.drawable.ahly, R.drawable.zamalek, 1, 0, "Team M", "Team N"));
        sportDays.add(sportDay3);

        return sportDays;

    }
}
