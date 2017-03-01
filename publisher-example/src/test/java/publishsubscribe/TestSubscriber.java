package publishsubscribe;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestSubscriber {

    private Subscriber subscribe;
    private String message = "This is a message";

    @Before
    public void setup() {
        subscribe = new Subscriber();
    }

    @Test
    public void displayMessage() {
        String actual = subscribe.getMessage("A message");
        assertEquals("A message", actual);
    }

    @Test
    public void receiveMessage() {
        List messageList = subscribe.messageList(message);
        assertEquals(1, messageList.size());
    }
}
