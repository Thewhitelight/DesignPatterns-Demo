package cn.libery.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ibery on 2017/3/12.
 */

public class TicketFactory {
    private static Map<String, Ticket> ticketMap = new HashMap<>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (ticketMap.containsKey(key)) {
            System.out.println("使用缓存==>");
            return ticketMap.get(key);
        } else {
            System.out.println("创建对象==>");
            Ticket ticket = new TrainTicket(from, to);
            ticketMap.put(key, ticket);
            return ticket;
        }
    }
}
