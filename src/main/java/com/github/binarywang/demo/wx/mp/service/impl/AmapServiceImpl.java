package com.github.binarywang.demo.wx.mp.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.binarywang.demo.wx.mp.pojo.AmapWeatherInfoPojo;
import com.github.binarywang.demo.wx.mp.service.IAmapService;
import okhttp3.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class AmapServiceImpl implements IAmapService {
    @Override
    public AmapWeatherInfoPojo getBeijingWeatherInfo() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .connectTimeout(3000, TimeUnit.MILLISECONDS)
            .readTimeout(3000, TimeUnit.MILLISECONDS)
            .build();
        Request request = new Request.Builder()
            .url("https://restapi.amap.com/v3/weather/weatherInfo?key=80ffaa9049511c4ba7c53cd3f64c7f79&city=110101")
            .method(HttpMethod.GET.name(), null)
            .addHeader(HttpHeaders.USER_AGENT, "Apifox/1.0.0 (https://apifox.com)")
            .addHeader(HttpHeaders.ACCEPT, "*/*")
            .addHeader(HttpHeaders.HOST, "restapi.amap.com")
            .addHeader(HttpHeaders.CONNECTION, "keep-alive")
            .build();
        Response response;
        response = client.newCall(request).execute();
        ResponseBody responseBody = response.body();
        assert responseBody != null;
        String string = responseBody.string();
        return JSON.parseObject(string, AmapWeatherInfoPojo.class);
    }

    @Override
    public String getBeijingWeatherString() {
        try {
            return getBeijingWeatherInfo().getLives().toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
