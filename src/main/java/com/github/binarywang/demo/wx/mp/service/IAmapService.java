package com.github.binarywang.demo.wx.mp.service;

import com.github.binarywang.demo.wx.mp.pojo.AmapWeatherInfoPojo;

import java.io.IOException;

public interface IAmapService {
    AmapWeatherInfoPojo getBeijingWeatherInfo() throws IOException;

    String getBeijingWeatherString();
}
