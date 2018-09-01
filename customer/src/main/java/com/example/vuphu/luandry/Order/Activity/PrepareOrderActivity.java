package com.example.vuphu.luandry.Order.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vuphu.luandry.Order.ApdapterList.ListOrderDetailAdapter;
import com.example.vuphu.luandry.Order.IOrderDetail;
import com.example.vuphu.luandry.Order.OBOrderDetail;
import com.example.vuphu.luandry.R;

import java.util.ArrayList;
import java.util.List;

public class PrepareOrderActivity extends AppCompatActivity {

    private RecyclerView listPrepareOrder;
    private ListOrderDetailAdapter adapter;
    private List<IOrderDetail> orderDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare_order);

        init();
    }

    private void init(){
        listPrepareOrder = findViewById(R.id.prepare_order_list_category);
        listPrepareOrder.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listPrepareOrder.setLayoutManager(linearLayoutManager);
        orderDetailList = new ArrayList<>();
        prepareList();
        adapter = new ListOrderDetailAdapter(this,orderDetailList);
        listPrepareOrder.setAdapter(adapter);
    }

    private void prepareList(){

        for (int i=0;i<10;i++) {
            IOrderDetail detail = new OBOrderDetail();
            detail.setTitle("Category " + i);
            detail.setPricing("200"+i);
            orderDetailList.add(detail);
        }
    }
}
