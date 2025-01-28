package QSpider.object;

import java.util.Date;

public class ObjectDriver {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.sender_id = 1L;
        msg.receiver_id = 2L;
        msg.content = "Test Message From Tester";
        msg.createdAt = new Date();
        System.out.println(msg);
    }
}
