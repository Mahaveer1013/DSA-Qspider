package QSpider.object;

import java.util.Date;

public class Message {
    Long sender_id;
    Long receiver_id;
    String content;
    Date createdAt;

    public String toString() {
        return "Message(\n    sender_id: " + sender_id + ",\n    receiver_id: " + receiver_id + ",\n    content: " + content + ",\n    createdAt: " + createdAt + "\n)";
    }
}
