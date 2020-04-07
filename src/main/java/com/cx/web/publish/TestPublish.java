package com.cx.web.publish;

import com.cx.web.Service.impl.WeatherServiceImpl;

import javax.xml.ws.Endpoint;

public class TestPublish {
    public static void main(String[] args) {
        //发布服务
        Endpoint.publish("http://localhost:8888/ws",new WeatherServiceImpl());
    }
}
