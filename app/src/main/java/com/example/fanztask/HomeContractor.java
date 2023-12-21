package com.example.fanztask;

import com.example.fanztask.models.SportDay;

import java.util.List;

public interface HomeContractor {
    void onSportsDaysLoaded(List<SportDay> days);
}
