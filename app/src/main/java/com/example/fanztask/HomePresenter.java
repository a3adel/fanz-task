package com.example.fanztask;

import static java.sql.DriverManager.println;

import com.example.fanztask.models.SportDay;
import com.example.fanztask.repo.DataRepo;

import java.util.List;

public class HomePresenter {
    HomeContractor contractor;
    DataRepo repo;

    public HomePresenter(HomeContractor contractor, DataRepo repo) {
        this.contractor = contractor;
        this.repo = repo;
    }

    public void getSportDays(){
        List<SportDay> days = repo.getSportDays();
        println(days.size()+"");
        this.contractor.onSportsDaysLoaded(days);
    }
}
