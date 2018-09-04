package com.example.vuphu.luandry.Order.ApdapterList;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vuphu.luandry.Order.OBOrderDetail;
import com.example.vuphu.luandry.R;
import com.github.florent37.androidslidr.Slidr;

public class ListClothesViewHolder extends ViewHolder {


    View itemView;
    ImageView img;
    TextView title;
    TextView price;
    TextView count;
    //Number Picker
    FrameLayout badge;

  /*  EditText value;
    Button   decrement, increment;*/
    OBOrderDetail detail;
    public ListClothesViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        img = itemView.findViewById(R.id.item_prepare_order_icon);
        title = itemView.findViewById(R.id.item_prepare_order_txt_title);
        price = itemView.findViewById(R.id.item_prepare_order_txt_price);
        count = itemView.findViewById(R.id.item_prepare_order_count);
        badge = itemView.findViewById(R.id.badge);
    }

}
