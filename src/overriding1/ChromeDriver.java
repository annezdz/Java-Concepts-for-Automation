package overriding1;

public class ChromeDriver extends WebDriver{

    public void click(){
        System.out.println("Clicking in Chrome");
    }

    public void sendKey(){
        System.out.println("Typing in Chrome");
    }
}
