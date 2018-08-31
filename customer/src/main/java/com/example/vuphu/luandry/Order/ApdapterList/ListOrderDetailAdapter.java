package com.example.vuphu.luandry.Order.ApdapterList;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vuphu.luandry.R;
import com.example.vuphu.luandry.Service.IService;

import java.util.List;

public class ListOrderDetailAdapter extends RecyclerView.Adapter<ListOrderDetailViewHolder> {


    List<IService> list;
    Activity context;

    public ListOrderDetailAdapter(Activity applicationContext, List<IService> listItem) {
        this.context = applicationContext;
        this.list = listItem;
    }

    @NonNull
    @Override
    public ListOrderDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_service,parent, false);
        return new ListOrderDetailViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListOrderDetailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
