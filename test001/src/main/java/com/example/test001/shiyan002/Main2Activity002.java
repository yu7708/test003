package com.example.test001.shiyan002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.test001.R;

import java.util.Arrays;

public class Main2Activity002 extends AppCompatActivity {
    //选择排序,从头到尾选出最小的，放在第k位。
    private static final String TAG = "Main2Activity002";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2002);
        initData();
    }

    private void initData() {
        int[] niArr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        for(int k=0;k<niArr.length-1;k++){
            int min=niArr[k];
            int minIndex=k;
            for(int i=1+k;i<niArr.length;i++){
                if(min>niArr[i]){
                    min=niArr[i];
                    minIndex=i;
                }
            }
            int temp=niArr[minIndex];
            niArr[minIndex]=niArr[k];
            niArr[k]=temp;
            //System.out.println(Arrays.toString(niArr));
            Log.e(TAG, "initData:niArr="+ Arrays.toString(niArr));
        }
    }
}
