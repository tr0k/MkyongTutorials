package pl.tr0k;

/**
 * Created by tr0k on 2014-07-10.
 */
public class HelloWorld {

    private String message;

    public String getMessage() {
        StringBuffer buffer = new StringBuffer("Test message : ");
        buffer.append(message);
        return buffer.toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
