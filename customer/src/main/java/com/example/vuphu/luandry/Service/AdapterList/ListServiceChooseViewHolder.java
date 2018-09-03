package com.example.vuphu.luandry.Service.AdapterList;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vuphu.luandry.R;
import com.uniquestudio.library.CircleCheckBox;

public class ListServiceChooseViewHolder extends RecyclerView.ViewHolder{


    public CircleCheckBox checkBox;
    public TextView name;
    public ListServiceChooseViewHolder(View itemView) {
        super(itemView);
        checkBox = itemView.findViewById(R.id.item_choose_check_box);
        name = itemView.findViewById(R.id.item_choose_txt_title);
    }
}
