package publishsubscribe;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    public ArrayList addSubscriber(Subscriber subscribe) {
        ArrayList publishList = new ArrayList();
        publishList.add(subscribe);
        return publishList;
    }

    public List sendMessage(Subscriber subscriber, String message) {
        List sentMessageList = subscriber.messageList(message);
        return sentMessageList;
    }
}