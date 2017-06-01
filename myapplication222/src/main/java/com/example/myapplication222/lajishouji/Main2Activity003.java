package com.example.myapplication222.lajishouji;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.myapplication222.R;

import java.lang.reflect.Field;
import java.text.DateFormat;

public class Main2Activity003 extends AppCompatActivity {
    private static final String TAG = "Main2Activity003";
    private String deviceInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2003);
    }

    public void onClick(View view) {
        String appInfo = getAppInfo();
        Log.e(TAG, "onClick: appInfo=" + appInfo);
        String deviceInfo = getDeviceInfo();
        Log.e(TAG, "onClick: deviceInfo"+deviceInfo );
    }

    public String getAppInfo() {
        /*
        * 拿到包名的管理
        * 然后的包名的信息
        * */
        PackageManager pm = getPackageManager();
        StringBuilder sb=new StringBuilder();
        try {
            PackageInfo pi = pm.getPackageInfo(getPackageName(), 0);
            sb.append("versionName:").append(pi.versionName)
                    .append("\n")
                    .append("versionCode:").append(pi.versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String getDeviceInfo() {
        /*
        * 获取设备的信息
        * */
        Field[] fields= Build.class.getDeclaredFields();
        StringBuilder sb=new StringBuilder();
        for(Field field:fields){
            field.setAccessible(true);
            try {
                sb.append(field.getName()).append("=").append(field.get(null).toString()).append("\n");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}
