package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.prototype.Document;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PrototypeUnitTest {

    @Test
    public void PrototypeTest() throws Exception {
        Document d = new Document();
        d.setmTxt("这是行文字");
        d.addImgs("图片1");
        d.addImgs("图片2");
        d.addImgs("图片3");
        d.showDocument();
        Document d2 = d.clone();
        d2.setmTxt("这是行文字2");
        d2.addImgs("图片4");
        d2.showDocument();
    }

}