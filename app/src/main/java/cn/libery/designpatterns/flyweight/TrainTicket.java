package cn.libery.designpatterns.flyweight;

import java.util.Random;

/**
 * Created by ibery on 2017/3/12.
 */

public class TrainTicket implements Ticket {
    private String from;
    private String to;
    private String bunk;
    private int price;

    public TrainTicket(String to, String from) {
        this.to = to;
        this.from = from;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从:" + from + "到" + to + "的" + bunk + "火车票 价格:" + price);
    }

}
