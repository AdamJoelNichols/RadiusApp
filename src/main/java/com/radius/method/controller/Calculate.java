package com.radius.method.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/calculate")
public class Calculate {
    @GetMapping
    public double calculateRadius(@RequestParam String circumference) {
        try {
            return Double.parseDouble(circumference) / (2 * Math.PI);
        } catch (Exception e) {
            return 0.0;
        }
    }
}