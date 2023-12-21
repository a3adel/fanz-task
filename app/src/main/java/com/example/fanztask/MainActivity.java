package com.example.fanztask;

import static java.sql.DriverManager.println;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.fanztask.adapters.SportDaysAdapter;
import com.example.fanztask.databinding.ActivityMainBinding;
import com.example.fanztask.models.SportDay;
import com.example.fanztask.repo.FakeDataRepo;

import java.util.List;

public class MainActivity  extends ComponentActivity implements HomeContractor {
    private ActivityMainBinding binding;
    SportDaysAdapter adapter = new SportDaysAdapter();
    HomePresenter homePresenter = new HomePresenter(this,new FakeDataRepo());
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        homePresenter.getSportDays();
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(binding.getRoot().getContext(), LinearLayoutManager.HORIZONTAL, false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(binding.daysRecyclerView.getContext(),
                layoutManager.getOrientation());
        binding.daysRecyclerView.addItemDecoration(dividerItemDecoration);
        binding.daysRecyclerView.setLayoutManager(layoutManager);
        binding.daysRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onSportsDaysLoaded(List<SportDay> days) {
        println("helllo");
        adapter.setDays(days);
        adapter.notifyDataSetChanged();
    }
}
