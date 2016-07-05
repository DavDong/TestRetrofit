package com.blue.testretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.blue.testretrofit.dao.MeiziData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    public static final String HOST = "http://gank.io/api/";

    TextView tv1;
    Retrofit retrofit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
//        Gson gson = new GsonBuilder()
//                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
//                .create();
//
//        //创建retrofit实例
//        retrofit = new Retrofit
//                .Builder()
//                .baseUrl(HOST)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build();


        //创建retrofit实例
        retrofit = new Retrofit
                .Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        initData();

    }

    private void initData() {
        GankRetrofit gankRetrofit = retrofit.create(GankRetrofit.class);
        Call<MeiziData> call = gankRetrofit.getMeiziData(10,1);//填入参数
        call.enqueue(new Callback<MeiziData>() {
            @Override
            public void onResponse(Call<MeiziData> call, Response<MeiziData> response) {

                List<MeiziData.ResultsBean> resultsBeen = response.body().getResults();
                tv1.setText(resultsBeen.get(0).getUrl());

            }

            @Override
            public void onFailure(Call<MeiziData> call, Throwable t) {

            }
        });


    }
}
