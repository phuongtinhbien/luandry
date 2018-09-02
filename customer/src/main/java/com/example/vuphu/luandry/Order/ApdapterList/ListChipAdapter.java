package com.example.vuphu.luandry.Order.ApdapterList;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vuphu.luandry.ChipViewHolder.ChipViewHolder;
import com.example.vuphu.luandry.R;
import com.robertlevonyan.views.chip.OnSelectClickListener;

import java.util.ArrayList;
import java.util.List;

public class ListChipAdapter extends RecyclerView.Adapter<ChipViewHolder> {

    List<String> list;
    Context context;
    List<Long> itemId;

    public ListChipAdapter(List<String> chip, Context context) {
        this.list = chip;
        this.context = context;
        this.itemId = new ArrayList<>();
    }

    @NonNull
    @Override
    public ChipViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_filter_chip,parent, false);
        return new ChipViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ChipViewHolder holder, int position) {

        holder.chip.setChipText(list.get(position));
        itemId.add(getItemId(position));
        holder.chip.setOnSelectClickListener(new OnSelectClickListener() {
            @Override
            public void onSelectClick(View v, boolean selected) {

            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
