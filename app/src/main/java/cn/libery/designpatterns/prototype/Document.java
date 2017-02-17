package cn.libery.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ibery on 2017/2/17.
 */

public class Document implements Cloneable {

    private String mTxt;

    public List<String> getmImgs() {
        return mImgs;
    }

    public void setmImgs(List<String> mImgs) {
        this.mImgs = mImgs;
    }

    public String getmTxt() {
        return mTxt;
    }

    public void setmTxt(String mTxt) {
        this.mTxt = mTxt;
    }

    private List<String> mImgs = new ArrayList<>();

    public void addImgs(String img) {
        mImgs.add(img);
    }

    @Override
    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    public void showDocument() {
        System.out.println("---start---");
        System.out.println("Text:" + mTxt);
        System.out.println("Img List:");
        for (String img : mImgs) {
            System.out.println("Img:" + img);
        }
        System.out.println("---end---");
    }
}
