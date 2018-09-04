package com.example.vuphu.luandry.Order.ApdapterList;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vuphu.luandry.Order.OBOrderDetail;
import com.example.vuphu.luandry.R;

import java.util.ArrayList;
import java.util.List;

public class ListClothesAdapter extends RecyclerView.Adapter<ListClothesViewHolder> {


    private static String CURRENCY = "VND";
    List<OBOrderDetail> list;
    Activity context;

    public ListClothesAdapter(Activity applicationContext, List<OBOrderDetail> listItem) {
        this.context = applicationContext;
        this.list = listItem;
    }

    @NonNull
    @Override
    public ListClothesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_prepare_order_clothes,parent, false);
        return new ListClothesViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListClothesViewHolder holder, int position) {

        holder.title.setText(list.get(position).getTitle());
        holder.price.setText(CURRENCY + " " + list.get(position).getPricing());
        Log.i("data", list.get(position).getCount()+"");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
