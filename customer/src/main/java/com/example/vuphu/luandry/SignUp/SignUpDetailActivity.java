package com.example.vuphu.luandry.SignUp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.vuphu.luandry.MainActivity;
import com.example.vuphu.luandry.Notification.DatePickerPopup;
import com.example.vuphu.luandry.Notification.Popup;
import com.example.vuphu.luandry.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class SignUpDetailActivity extends AppCompatActivity {

    private EditText edtDateOfBirth;
    private EditText edtGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_detail);
        init();
    }

    private void init() {

        edtDateOfBirth = findViewById(R.id.sign_up_dtl_edt_date_of_birth);
        edtGender = findViewById(R.id.sign_up_dtl_edt_gender);

    }

    public void processFinish(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void processChooseGender(View view) {
        List<String> gender= Arrays.asList(getResources().getStringArray(R.array.arr_gender));
        Popup popup = new Popup(SignUpDetailActivity.this);
        popup.createListPopup(gender, "Please choose one", edtGender);
        popup.show();
    }

    public void processChooseDoB(View view) {
        DatePickerPopup datePicker = new DatePickerPopup(this, edtDateOfBirth);
        datePicker.show();
    }

}
