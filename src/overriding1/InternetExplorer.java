package overriding1;

public class InternetExplorer extends WebDriver{
    public void click(){
        System.out.println("Clicking in IE");


    }

    public void sendKey(){
        System.out.println("Typing in IE");
    }
}
