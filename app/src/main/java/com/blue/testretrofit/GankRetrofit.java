package com.blue.testretrofit;

import com.blue.testretrofit.dao.MeiziData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2016/7/5.
 */
public interface GankRetrofit {
    //http://gank.io/api/data/数据类型/月/日
    @GET("data/Android/{month}/{day}")
    Call<MeiziData> getMeiziData(@Path("month") int month,@Path("day") int day);
}
