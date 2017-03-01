package publishsubscribe;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestPublisher {

    private Publisher publish;
    private Subscriber subscribe;

    @Before
    public void setup() {
        publish = new Publisher();
        subscribe = new Subscriber();
    }

    @Test
    public void testAddSubscriber() throws Exception {
        ArrayList subscriberList = publish.addSubscriber(subscribe);
        assertEquals(1, subscriberList.size());
    }

    @Test
    public void sendMessage() {
        String message = "This is a message";
        List messageList = publish.sendMessage(subscribe, message);
        List receivedMessageList = subscribe.messageList(message);
        assertEquals(1, receivedMessageList.size());
    }

}