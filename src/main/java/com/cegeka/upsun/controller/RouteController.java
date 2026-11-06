package com.cegeka.upsun.controller;

import com.cegeka.upsun.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/routes")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @GetMapping
    private ResponseEntity<String> about() {
        return ResponseEntity.ok("Hello from Spring Boot running on Upsun!");
    }

    @GetMapping("/get-values")
    private ResponseEntity<String> readConfig() {
        return ResponseEntity.ok(routeService.readConfig());
    }

}
