package overriding1;

public class FirefoxDriver  extends WebDriver{

    public void click(){
        System.out.println("Clicking in FF");

    }

    public void sendKey(){
        System.out.println("Typing in FF");

    }
}
