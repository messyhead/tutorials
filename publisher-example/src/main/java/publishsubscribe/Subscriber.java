package publishsubscribe;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    public String getMessage(String message) {
        return message;
    }

    public Subscriber() {
    }

    public List messageList(String message) {
        List<String> messageList = new ArrayList<String>();

        messageList.add(message);

        return messageList;
    }
}
