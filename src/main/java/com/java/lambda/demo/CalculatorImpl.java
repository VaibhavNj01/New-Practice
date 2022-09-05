package com.java.lambda.demo;


import lombok.Data;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

interface Calculator {
    //  void switchOn();

    //void sum(int input);
    int substract(int i1, int i2);
}

@Log4j2
public class CalculatorImpl {
    public static void main(String[] args) {
//        Calculator calculator = () -> System.out.println("switch on");
//        calculator.switchOn();

      /*  Calculator calculator = (input) -> log.info("sum:"+input);
        calculator.sum(349);
       */
        Calculator calculator = (i1, i2) -> {
            if (i2 < i1) {
                throw new RuntimeException("i2 should be less than i1");
            }
            return i2 - i1;
        };
        log.info(calculator.substract(50,10));


    }

}

