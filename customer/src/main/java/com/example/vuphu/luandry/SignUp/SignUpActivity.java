package com.example.vuphu.luandry.SignUp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.vuphu.luandry.Login.LoginActivity;
import com.example.vuphu.luandry.R;
import com.example.vuphu.luandry.Utils.Util;

public class SignUpActivity extends AppCompatActivity {


    private FloatingActionButton btnContinue;
    private EditText edtUserName;
    private EditText edtPassword;
    private EditText edtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
    }

    private void init() {
        btnContinue = findViewById(R.id.sign_up_btn_continue);
        edtUserName = findViewById(R.id.sign_up_edt_user_name);
        edtEmail    = findViewById(R.id.sign_up_edt_email);
        edtPassword = findViewById(R.id.sign_up_edt_user_password);
        Util.showHideCursor(edtUserName);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SignUpDetailActivity.class));
            }
        });
    }

    public void processBackLogin(View view) {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }


}
