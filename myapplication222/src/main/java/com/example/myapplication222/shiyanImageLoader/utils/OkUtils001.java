package com.example.myapplication222.shiyanImageLoader.utils;

import android.os.Handler;
import android.os.Message;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;


/**
 * Created by 余 on 2017/5/9.
 */

public class OkUtils001<T> {
    private static String UTF_8="utf-8";
    public static final int RESULT_SUCCESS=0;
    public static final int RESULT_ERROR=1;
    public static final int DOWNLOAD_START=2;
    public static final int DOWNLOADING=3;
    public static final int DOWNLOAD_FINISH=4;

    private static OkHttpClient mOkHttpClient;
    private Handler mHanlder;

    public interface OnCompeteListener<T>{
        void onSuccess(T result);
        void onError(String error);
    }
    private OnCompeteListener<T> mListener;

    OkHttpClient.Builder mBuilder;

    Callback mCallback=new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
            Message msg = Message.obtain();
            msg.what=RESULT_ERROR;
            msg.obj=e.getMessage();
            mHanlder.sendMessage(msg);
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            String json=response.body().string();
            Gson gson=new Gson();
            T t=null;
        }
    };

    public static void release(){
        if(mOkHttpClient==null){
            synchronized (OkUtils001.class){
                if(mOkHttpClient==null){
                    mOkHttpClient.dispatcher().cancelAll();
                    mOkHttpClient=null;
                }
            }
        }
    }
}
