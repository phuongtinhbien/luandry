package com.example.vuphu.luandry.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.vuphu.luandry.MainActivity;
import com.example.vuphu.luandry.R;
import com.example.vuphu.luandry.SignUp.SignUpActivity;
import com.example.vuphu.luandry.Utils.Util;

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail;
    private EditText edtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        edtEmail = findViewById(R.id.login_edt_user_name);
        edtPassword = findViewById(R.id.login_edt_user_password);
        Util.showHideCursor(edtEmail);

    }

    public void processLogin(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }

    public void processSignUp(View view) {

        startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
    }
}
