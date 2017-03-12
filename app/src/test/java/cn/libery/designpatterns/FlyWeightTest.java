package cn.libery.designpatterns;

import org.junit.Test;

import cn.libery.designpatterns.flyweight.Ticket;
import cn.libery.designpatterns.flyweight.TicketFactory;

/**
 * Created by ibery on 2017/3/12.
 */

public class FlyWeightTest {
    @Test
    public void flyweightTest() throws Exception {
        Ticket train1 = TicketFactory.getTicket("北京", "杭州");
        train1.showTicketInfo("二等座");
        Ticket train2 = TicketFactory.getTicket("北京", "杭州");
        train2.showTicketInfo("一等座");
        Ticket train3 = TicketFactory.getTicket("北京", "杭州");
        train3.showTicketInfo("商务座");
    }
}
