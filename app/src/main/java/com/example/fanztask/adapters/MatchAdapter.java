package com.example.fanztask.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fanztask.R;
import com.example.fanztask.databinding.ItemMatchBinding;
import com.example.fanztask.databinding.ItemSportDayBinding;
import com.example.fanztask.models.Match;
import com.example.fanztask.utils.HeightAnimator;

import java.util.ArrayList;
import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {
    private List<Match> matches = new ArrayList<>();

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMatchBinding binding = ItemMatchBinding
                .inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MatchViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match match = matches.get(position);
        holder.binding.rateTextView.setText(match.getRate().toString());
        if (match.getRate() < 5.0) {
            holder.binding.itemLinearLayout.setBackground(ContextCompat.getDrawable(holder.binding.getRoot().getContext(),
                    R.drawable.item_red_gradient_bg));
        } else if (match.getRate() >= 5 && match.getRate() < 7) {
            holder.binding.itemLinearLayout.setBackground(ContextCompat.getDrawable(holder.binding.getRoot().getContext(),
                    R.drawable.item_yellow_gradient_bg));
        } else {
            holder.binding.itemLinearLayout.setBackground(ContextCompat.getDrawable(holder.binding.getRoot().getContext(),
                    R.drawable.item_green_gradient_bg));
        }
        holder.binding.firstTeamImageView.setImageDrawable(ContextCompat.getDrawable(holder.binding.getRoot().getContext(),
                match.getFirstTeamLogoId()));
        holder.binding.secondTeamLogoImageView.setImageDrawable(ContextCompat.getDrawable(holder.binding.getRoot().getContext(),
                match.getSecondTeamLogoId()));
        String builder = match.getSecondTeamScore() +
                "-" +
                match.getFirstTeamScore();
        holder.binding.matchScoreTextView.setText(builder);
        int height = holder.binding.getRoot().getContext()
                .getResources().getDimensionPixelSize(R.dimen._500);

        holder.binding.itemLinearLayout.getLayoutParams().height = 0;
        holder.binding.itemLinearLayout.requestLayout();

        HeightAnimator.animateHeight(holder.binding.itemLinearLayout, 0, ((int) ((height * .55) + ((match.getRate() / 20) * (height )))
        ));
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    public void updateMatches(List<Match> matches) {

        this.matches.clear();
        this.matches.addAll(matches);
        notifyDataSetChanged();
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        private ItemMatchBinding binding;

        public MatchViewHolder(ItemMatchBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
