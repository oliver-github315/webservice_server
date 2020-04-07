package com.cx.web.Service.impl;

import com.cx.web.Service.WeatherService;

import javax.jws.WebService;

@WebService
public class WeatherServiceImpl implements WeatherService {
    @Override
    public String queryWeatherByCityName(String cityName) {

        System.out.println("服务被调用了------cityName: "+ cityName);
        if (cityName.equals("北京")){
            return "雾霾天气";
        }
        return "天气很棒";
    }
}
