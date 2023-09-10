package com.github.binarywang.demo.wx.mp.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Lives {
    private String province;
    private String city;
    private String adcode;
    private String temperature_float;
    private String humidity_float;
    private String windpower;
    private String weather;
    private String temperature;
    private String humidity;
    private Date reporttime;
    private String winddirection;
}
