package com.github.binarywang.demo.wx.mp.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.binarywang.demo.wx.mp.pojo.AmapWeatherInfoPojo;
import com.github.binarywang.demo.wx.mp.service.IAmapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.Map;

@SpringBootTest
class AmapServiceImplTest {

    @Autowired
    private IAmapService amapService;
    @Test
    void getBeijingWeatherInfo() throws IOException {
        AmapWeatherInfoPojo beijingWeatherInfo = amapService.getBeijingWeatherInfo();
        System.out.println("beijingWeatherInfo = " + beijingWeatherInfo);
    }
}
