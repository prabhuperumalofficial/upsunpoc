package com.cegeka.upsun.service;

import com.cegeka.upsun.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    @Autowired
    private AppProperties properties;

    @Value("${server.port}")
    private String serverPort;

    public String readConfig() {
        return properties.getName() + " : " + serverPort;
    }
}
