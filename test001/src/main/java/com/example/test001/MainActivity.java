package com.example.test001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.test001.shiyan001.Main2Activity001;
import com.example.test001.shiyan002.Main2Activity002;
import com.example.test001.shiyan003.Main2Activity003;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tiao(Class clazz){
        startActivity(new Intent(MainActivity.this,clazz));
    }
    public void shiyan001(View view){
        tiao(Main2Activity001.class);
    }
    public void shiyan002(View view){
        tiao(Main2Activity002.class);
    }
    public void shiyan003(View view){
        tiao(Main2Activity003.class);
    }
}
