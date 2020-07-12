package com.example.my12306application.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.my12306application.R;

public class LoginActivity extends AppCompatActivity {
    private Button btn_login,btn_register;
    private EditText edt_username,edt_pwd;
    private CheckBox cb_autoLogin;
    private TextView tv_forgetPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

    }

    private void init() {
        btn_login=findViewById(R.id.btn_login);
        btn_register=findViewById(R.id.btn_register);
        edt_username=findViewById(R.id.et_username);
        edt_pwd=findViewById(R.id.et_pwd);
        cb_autoLogin=findViewById(R.id.cb_autoLogin);
        tv_forgetPwd=findViewById(R.id.tv_forgetPwd);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
