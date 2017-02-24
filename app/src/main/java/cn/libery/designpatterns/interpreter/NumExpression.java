package cn.libery.designpatterns.interpreter;

/**
 * Created by ibery on 2017/2/24.
 */

public class NumExpression extends ArithmeticExpression {
    private int mNum;

    public NumExpression(int mNum) {
        this.mNum = mNum;
    }

    @Override
    public int interpreter() {
        return mNum;
    }
}
