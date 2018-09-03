package com.example.vuphu.luandry.Order.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.vuphu.luandry.R;

public class PrepareOrderTimeNoteActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare_order_time_note);
        initToolbar();
    }

    private void initToolbar() {
        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Create schedule");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
