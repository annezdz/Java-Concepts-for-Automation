package overriding1;

public class TestCase1 extends Base {

    String browserName = "chrome";


    public void initBrowser(){
        WebDriver driver = getBrowserInstance(browserName);
        driver.click();
        driver.sendKeys();
        driver.getTitle();
    }

    public static void main(String[] args) {

        TestCase1 case1 = new TestCase1();
        case1.initBrowser();

//        FirefoxDriver driver = new FirefoxDriver();
//        driver.click();
//        driver.sendKeys();
//        driver.getTitle();

//        ChromeDriver chrome = new ChromeDriver();
//
//        FirefoxDriver fire = new FirefoxDriver();
//
//        chrome.sendKey();
//        chrome.click();
//        chrome.getTitle();
//
//        fire.sendKeys();
//        fire.getTitle();
//        fire.click();



    }
}
