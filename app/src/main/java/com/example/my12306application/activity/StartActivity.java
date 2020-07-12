package com.example.my12306application.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import com.example.my12306application.R;

public class StartActivity extends AppCompatActivity {

    TextView tv;
    int time=5;
    Handler handler=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what==1){
                time--;
                if (time==0) {
                    Intent intent=  new Intent();
                    intent.setClass(StartActivity.this,LoginActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    tv.setText(time+"");
                    handler.sendEmptyMessageDelayed(1,1000);
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        tv=findViewById(R.id.start_tv);
        handler.sendEmptyMessageDelayed(1,1000);
    }
}
