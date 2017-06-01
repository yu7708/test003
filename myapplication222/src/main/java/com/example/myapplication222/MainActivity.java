package com.example.myapplication222;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication222.lajishouji.Main2Activity003;
import com.example.myapplication222.lunbo004.Main2Activity004;
import com.example.myapplication222.shiyan001.Main2Activity001;
import com.example.myapplication222.shiyan005.Main2Activity005;
import com.example.myapplication222.shiyanImageLoader.Main2Activity002;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Toast.makeText(this, "奖励一本小人书", Toast.LENGTH_SHORT).show();
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
    public void shiyan003(View view) {
        tiao(Main2Activity003.class);
    }
    public void shiyan004(View view){
    tiao(Main2Activity004.class);
}
    public void shiyan005(View view){
        tiao(Main2Activity005.class);
    }
}
