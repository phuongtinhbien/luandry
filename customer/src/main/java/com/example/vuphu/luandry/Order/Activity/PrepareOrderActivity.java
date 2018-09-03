package com.example.vuphu.luandry.Order.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.example.vuphu.luandry.Categories.OBCategory;
import com.example.vuphu.luandry.Order.ApdapterList.ListChipAdapter;
import com.example.vuphu.luandry.Order.ApdapterList.ListOrderDetailAdapter;
import com.example.vuphu.luandry.Order.OBOrderDetail;
import com.example.vuphu.luandry.R;

import java.util.ArrayList;
import java.util.List;

public class PrepareOrderActivity extends AppCompatActivity {

    private RecyclerView listPrepareOrder;
    private ListOrderDetailAdapter adapter;
    private List<OBOrderDetail> orderDetailList = new ArrayList<>();
    private List<OBOrderDetail> orderDetailFilterList = new ArrayList<>();
    private List<OBOrderDetail> orderDetailSelectedList = new ArrayList<>();
    private List<OBCategory> categoryList = new ArrayList<>();
    private List<String> tagList = new ArrayList<>();
    private RecyclerView listFilter;
    private ListChipAdapter listChipAdapter;
    private FloatingActionButton floatingActionButton;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare_order);

        initToolbar();
        init();
    }

    private void initToolbar() {
        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Choose your clothes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void init() {

        listPrepareOrder = findViewById(R.id.prepare_order_list_category);
        listPrepareOrder.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listPrepareOrder.setLayoutManager(linearLayoutManager);
        orderDetailList = new ArrayList<>();
        prepareList();
        orderDetailFilterList = orderDetailList;
        adapter = new ListOrderDetailAdapter(this, orderDetailFilterList);
        listPrepareOrder.setAdapter(adapter);
        listPrepareOrder.invalidate();
        floatingActionButton = findViewById(R.id.prepare_order_next);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PrepareOrderAddressActivity.class));
            }
        });
        //Tag Filter
        prepareCategory();
        listFilter = findViewById(R.id.list_chip);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        listFilter.setLayoutManager(staggeredGridLayoutManager);
        listChipAdapter = new ListChipAdapter(tagList, getApplicationContext());
        listFilter.setAdapter(listChipAdapter);

    }


    private void prepareList() {

        for (int i = 0; i < 10; i++) {
            OBOrderDetail detail = new OBOrderDetail();
            detail.setTitle("Product " + i);
            detail.setPricing("200" + i);
            if (i % 2 == 0)
                detail.setCategory("Category Type 1");
            else
                detail.setCategory("Category Type 2");
            orderDetailList.add(detail);
        }
    }


    private void prepareCategory() {
        tagList.add(0, "List All");
        for (int i = 1; i <= 6; i++) {
            OBCategory detail = new OBCategory();
            detail.setName("Category Type " + (i));
            detail.setCode("TYPE_" + (i));
            detail.setId(i + "");
            categoryList.add(detail);
            tagList.add(detail.getName());

        }
    }
}
