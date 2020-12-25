package com.bhargav.ratelimiter.tokenbucket.controller;

import com.bhargav.ratelimiter.tokenbucket.model.Calculator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/calculator")
public class CalculatorController {

    @GetMapping(value = "/add")
    public ResponseEntity<Calculator> add(@RequestParam int left, @RequestParam int right) {
        return ResponseEntity.ok(Calculator.builder()
                .operation("add").answer(left + right).build());
    }

    @GetMapping(value = "/subtract")
    public ResponseEntity<Calculator> subtract(@RequestParam int left, @RequestParam int right) {
        return ResponseEntity.ok(Calculator.builder()
                .operation("subtract").answer(left - right).build());
    }

    @GetMapping(value = "/multiply")
    public ResponseEntity<Calculator> multiply(@RequestParam int left, @RequestParam int right) {
        return ResponseEntity.ok(Calculator.builder()
                .operation("multiply").answer(left * right).build());
    }

}
