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

    @GetMapping("/minus")
    @ResponseBody
    public Integer minus(@RequestParam("number1") int number1, @RequestParam("number2") int number2){
        return number1-number2;
    }

    @GetMapping("/devide")
    @ResponseBody
    public Integer devide(@RequestParam("number1") int number1, @RequestParam("number2") int number2){
        if(number1 == 0){
            throw new RuntimeException("CAN NOT DEVIDE BY ZERO");
        }
        else{
            return number1/number2;
        }
    }

    @GetMapping("/multiply")
    @ResponseBody
    public Integer multiply(@RequestParam("number1") int number1, @RequestParam("number2") int number2){
        return number1*number2;
    }


}
