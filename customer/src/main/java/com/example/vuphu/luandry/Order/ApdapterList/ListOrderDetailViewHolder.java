package com.example.vuphu.luandry.Order.ApdapterList;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vuphu.luandry.R;

public class ListOrderDetailViewHolder extends ViewHolder {


    ImageView img;
    TextView title;
    TextView price;
    TextView count;
    EditText production;
    EditText material;
    EditText color;
    EditText note;
    public ListOrderDetailViewHolder(View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.item_prepare_order_icon);
        title = itemView.findViewById(R.id.item_prepare_order_txt_title);
        price = itemView.findViewById(R.id.item_prepare_order_txt_price);
        count = itemView.findViewById(R.id.item_prepare_order_count);
        production = itemView.findViewById(R.id.item_prepare_order_production);
        material = itemView.findViewById(R.id.item_prepare_order_material);
        color = itemView.findViewById(R.id.item_prepare_order_color);
        note = itemView.findViewById(R.id.item_prepare_order_note);

    }
}
