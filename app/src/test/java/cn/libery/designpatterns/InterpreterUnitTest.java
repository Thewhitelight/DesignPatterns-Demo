package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.interpreter.Calculator;

public class InterpreterUnitTest {

    @Test
    public void InterpreterTest() throws Exception {
        Calculator calculator = new Calculator("1 + 2 + 3 + 4 - 5");
        System.out.println(calculator.calculate());
    }

}