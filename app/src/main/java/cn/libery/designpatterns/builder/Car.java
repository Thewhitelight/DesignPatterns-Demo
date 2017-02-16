package cn.libery.designpatterns.builder;

/**
 * Created by ibery on 2017/2/16.
 */

public abstract class Car {
    protected String mEngine;
    protected String mTires;
    protected String mBody;

    public String getBody() {
        return mBody;
    }

    public abstract void setBody();

    public String getTires() {
        return mTires;
    }

    public void setTires(String mTires) {
        this.mTires = mTires;
    }

    public String getEngine() {
        return mEngine;
    }

    public void setEngine(String mEngine) {
        this.mEngine = mEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mEngine='" + mEngine + '\'' +
                ", mTires='" + mTires + '\'' +
                ", mBody='" + mBody + '\'' +
                '}';
    }
}
