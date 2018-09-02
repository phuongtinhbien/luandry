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

public class ListOrderDetailAdapter extends RecyclerView.Adapter<ListOrderDetailViewHolder> {


    private static String CURRENCY = "VND";
    List<OBOrderDetail> list;
    List<OBOrderDetail> selectedList;
    Activity context;

    public ListOrderDetailAdapter(Activity applicationContext, List<OBOrderDetail> listItem) {
        this.context = applicationContext;
        this.list = listItem;
        this.selectedList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ListOrderDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_prepare_order,parent, false);
        return new ListOrderDetailViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListOrderDetailViewHolder holder, int position) {

        holder.title.setText(list.get(position).getTitle());
        holder.price.setText(CURRENCY + " " + list.get(position).getPricing());
        holder.processData(list.get(position));
        Log.i("data", list.get(position).getCount()+"");

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void refreshAdapter(List<OBOrderDetail> list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }
}
