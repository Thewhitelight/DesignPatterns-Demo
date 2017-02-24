package cn.libery.designpatterns.interpreter;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by ibery on 2017/2/24.
 */

public class Calculator {
    private Deque<ArithmeticExpression> mStack = new ArrayDeque<>();

    public Calculator(String expression) {

        ArithmeticExpression exp1, exp2;
        String[] elements = expression.split(" ");
        for (int i = 0, size = elements.length; i < size; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    exp1 = mStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mStack.push(new AdditionExpression(exp1, exp2));
                    break;
                default:
                    mStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }

    }

    public int calculate() {
        return mStack.pop().interpreter();
    }
}
