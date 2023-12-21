package com.example.fanztask.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fanztask.R;
import com.example.fanztask.databinding.ItemSportDayBinding;
import com.example.fanztask.models.SportDay;
import com.example.fanztask.utils.MarginItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class SportDaysAdapter extends RecyclerView.Adapter<SportDaysAdapter.SportDayViewHolder> {
    private List<SportDay> days = new ArrayList<>();

    @NonNull
    @Override
    public SportDayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemSportDayBinding binding = ItemSportDayBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new SportDayViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SportDayViewHolder holder, int position) {
        SportDay day = days.get(position);
        holder.binding.dateTextView.setText(days.get(position).getDate());
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(holder.binding.getRoot().getContext(), LinearLayoutManager.HORIZONTAL, false);
        holder.binding.matchesRecyclerView.setLayoutManager(layoutManager);
        holder.binding.matchesRecyclerView.addItemDecoration(
                new MarginItemDecoration(holder.binding.getRoot().getContext().getResources()
                        .getDimensionPixelSize(R.dimen._8)));
        MatchAdapter adapter = new MatchAdapter();
        holder.binding.matchesRecyclerView.setAdapter(adapter);
        adapter.updateMatches(day.getMatches());

    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    public void setDays(List<SportDay> days) {
        this.days.clear();
        this.days.addAll(days);
        notifyDataSetChanged();
    }

    static class SportDayViewHolder extends RecyclerView.ViewHolder {
        private ItemSportDayBinding binding;

        public SportDayViewHolder(ItemSportDayBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
