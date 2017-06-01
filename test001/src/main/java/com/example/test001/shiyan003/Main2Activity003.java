package com.example.test001.shiyan003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.test001.R;

import java.util.Arrays;

public class Main2Activity003 extends AppCompatActivity {
    //插入排序，先选择好最小的一个再往第k个排
    private static final String TAG = "Main2Activity003";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2003);
        initView();
        //initData1();
        //initData2();
    }

    private void initData2() {
        int[] niArr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        for(int k=0;k<niArr.length-1;k++){
            int current = niArr[k+1];//当前准备插入的元素
            int index=k+1;//当前准备插入的元素的下标
            for(int i=index;i>=0;i--){
                if(current<niArr[i]){
                    //niArr[0]后移一位
                    niArr[i+1]=niArr[i];
                    //待插入元素下标计算
                    index --;
                }
                niArr[index]=current;
            }
            //System.out.println(Arrays.toString(niArr));
            Log.e(TAG, "initData: niArr="+ Arrays.toString(niArr));
        }
    }
    //单个的好像没什么效果
    private void initData1() {
        int[] niArr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //第一轮：
        int current = niArr[1];//当前准备插入的元素
        int index=1;//当前准备插入的元素的下标
        //for(int i=0;i<niArr.length;i++){
        if(current<niArr[0]){
            //niArr[0]后移一位
            niArr[1]=niArr[0];
            //待插入元素下标计算
            index --;
        }
        niArr[index]=current;
       // System.out.println(Arrays.toString(niArr));
        Log.e(TAG, "initData: 第一行niArr="+ Arrays.toString(niArr));
        //}
    }

    private void initView() {
        findViewById(R.id.btn0031).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData1();
            }
        });
        findViewById(R.id.btn0032).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData2();
            }
        });
    }
}
