package interfacepack;

public class ChromeDriverChild extends ChromeDriver{

    public static void main(String[] args) {

        ChromeDriverChild child = new ChromeDriverChild();
        child.sendKeys();
        child.click();
        child.windowMaximize();
    }


}
