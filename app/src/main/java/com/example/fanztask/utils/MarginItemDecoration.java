package com.example.fanztask.utils;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class MarginItemDecoration extends RecyclerView.ItemDecoration {
    private final int spaceSize;

    public MarginItemDecoration(int spaceSize) {
        this.spaceSize = spaceSize;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        outRect.left = spaceSize;
        outRect.right = spaceSize;

    }
}
