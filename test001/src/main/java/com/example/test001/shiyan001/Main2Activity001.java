package com.example.test001.shiyan001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.test001.R;

import java.util.Arrays;

public class Main2Activity001 extends AppCompatActivity {
    //冒泡排序，每一个比前面一个小的话就往前进一位
    private static final String TAG = "Main2Activity001";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2001);
        initData();
    }

    private void initData() {
        int[] niArr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        for(int k=0;k<niArr.length-1;k++){//控制轮数
            for(int i=0;i<niArr.length-1-k;i++){//每一轮比较的次数
                if(niArr[i]>niArr[i+1]){
                    int temp=niArr[i];
                    niArr[i]=niArr[i+1];
                    niArr[i+1]=temp;
                }
            }
           // System.out.println(Arrays.toString(niArr));
            Log.e(TAG, "initData: niArr="+ Arrays.toString(niArr));
        }
    }
}
