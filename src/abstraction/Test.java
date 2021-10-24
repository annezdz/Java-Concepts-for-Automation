package abstraction;

public class Test {
    public static void main(String[] args) {

        ChildFirefox childFirefox = new ChildFirefox();
        childFirefox.captureScreenshot();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.captureScreenshot();

        WebDriver driver = new ChildFirefox();
        driver.captureScreenshot();
        //driver.childMethod(); -> dont work

    }
}
