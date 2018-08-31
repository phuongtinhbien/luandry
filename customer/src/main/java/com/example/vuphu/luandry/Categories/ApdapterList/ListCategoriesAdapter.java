package com.example.vuphu.luandry.Categories.ApdapterList;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vuphu.luandry.Categories.Activity.CategoriesActivity;
import com.example.vuphu.luandry.R;
import com.example.vuphu.luandry.Service.AdapterList.ListServiceViewHolder;
import com.example.vuphu.luandry.Service.IService;

import java.util.List;

public class ListCategoriesAdapter extends RecyclerView.Adapter<ListCategoriesViewHolder> {


    List<IService> listService;
    Activity context;

    public ListCategoriesAdapter(Activity applicationContext, List<IService> listItem) {
        this.context = applicationContext;
        this.listService = listItem;
    }

    @NonNull
    @Override
    public ListCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_service,parent, false);
        return new ListCategoriesViewHolder(v) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListCategoriesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listService.size();
    }
}
