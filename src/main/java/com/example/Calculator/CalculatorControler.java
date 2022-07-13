package com.example.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler { 

    @GetMapping("/add")
    @ResponseBody
    public Integer add(@RequestParam("number1") int number1, @RequestParam("number2") int number2){
        return number1+number2;
    }

}
