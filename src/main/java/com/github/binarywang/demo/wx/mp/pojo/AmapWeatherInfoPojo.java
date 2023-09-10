package com.github.binarywang.demo.wx.mp.pojo;

import lombok.Data;

import java.util.List;

@Data
public class AmapWeatherInfoPojo {
    private List<Lives> lives;
    private String count;
    private String infocode;
    private String status;
    private String info;
}
