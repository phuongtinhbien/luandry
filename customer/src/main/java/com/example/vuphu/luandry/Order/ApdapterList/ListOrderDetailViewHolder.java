package com.example.vuphu.luandry.Order.ApdapterList;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vuphu.luandry.Order.OBOrderDetail;
import com.example.vuphu.luandry.R;
import com.example.vuphu.luandry.Utils.Util;

public class ListOrderDetailViewHolder extends ViewHolder {


    View itemView;
    ImageView img;
    TextView title;
    TextView price;
    TextView count;
    EditText production;
    EditText material;
    EditText color;
    EditText note;
    //Number Picker
    FrameLayout badge;
    EditText value;
    Button   decrement, increment;
    OBOrderDetail detail;
    public ListOrderDetailViewHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        img = itemView.findViewById(R.id.item_prepare_order_icon);
        title = itemView.findViewById(R.id.item_prepare_order_txt_title);
        price = itemView.findViewById(R.id.item_prepare_order_txt_price);
        count = itemView.findViewById(R.id.item_prepare_order_count);
        production = itemView.findViewById(R.id.item_prepare_order_production);
        material = itemView.findViewById(R.id.item_prepare_order_material);
        color = itemView.findViewById(R.id.item_prepare_order_color);
        note = itemView.findViewById(R.id.item_prepare_order_note);

        //Number Picker
        value     =itemView.findViewById(R.id.value);
        value.setText("0");
        Util.showHideCursor(value);
        decrement = itemView.findViewById(R.id.decrement);
        increment = itemView.findViewById(R.id.increment);

        badge = itemView.findViewById(R.id.badge);
        processCount();
        showHideBadge();
    }

    public void processCount(){

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDown();
            }
        });
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countUp();
            }
        });
        value.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Util.showHideCursor(value);
            }
        });
        value.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(value.getId() == v.getId()){
                    count.setText(String.valueOf(value.getText().toString()));
                    checkLimit();
                    showHideBadge();
                }
            }
        });
    }

    public void countUp(){

        value.setText(String.valueOf(Long.parseLong(value.getText().toString())+1));
        count.setText(String.valueOf(value.getText().toString()));
        detail.setCount(Long.parseLong(value.getText().toString()));
        checkLimit();
        showHideBadge();
    }
    public void countDown(){

        value.setText(String.valueOf(Long.parseLong(value.getText().toString())-1));
        count.setText(String.valueOf(value.getText().toString()));
        detail.setCount(Long.parseLong(value.getText().toString()));
        checkLimit();
        showHideBadge();
    }

    public void checkLimit(){
        if (Long.parseLong(value.getText().toString())<=0){
            Toast.makeText(itemView.getContext(), R.string.notify_choose_more, Toast.LENGTH_SHORT).show();
            value.setText("0");
            decrement.setClickable(false);
        }
        else {
            decrement.setClickable(true);
        }
    }

    public void showHideBadge(){
        if (Long.parseLong(value.getText().toString())>0){
            badge.setVisibility(View.VISIBLE);
        }
        else {
            badge.setVisibility(View.GONE);
        }
    }

    public void processData(OBOrderDetail detail){
        this.detail = detail;
    }
}
