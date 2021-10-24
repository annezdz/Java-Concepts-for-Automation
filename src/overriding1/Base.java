package overriding1;

public class Base {

    public WebDriver getBrowserInstance(String browserName){
        if(browserName.equals("firefox")){
            return new FirefoxDriver();
        }
        else if (browserName.equals("chrome")){
            return new ChromeDriver();
        }else if(browserName.equals("ie")){
            return new WebDriver();
        }
        return new FirefoxDriver();
    }
}
