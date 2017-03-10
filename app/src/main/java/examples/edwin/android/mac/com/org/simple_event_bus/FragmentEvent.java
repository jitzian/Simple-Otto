package examples.edwin.android.mac.com.org.simple_event_bus;

/**
 * Created by User on 11/14/2016.
 */

public class FragmentEvent {
    private String message;

    public FragmentEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
