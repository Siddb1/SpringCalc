package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double num1,
            @RequestParam double num2,
            @RequestParam String operator
    ) {
        double result;

        switch (operator) {
            case "+":
                result = num1 + num2; break;
            case "-":
                result = num1 - num2; break;
            case "*":
                result = num1 * num2; break;
            case "/":
                if (num2 == 0) return "Error: Division by zero";
                result = num1 / num2; break;
            default:
                return "Invalid operator";
        }

        return "Result: " + result;
    }
}
