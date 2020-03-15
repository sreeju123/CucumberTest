package Utilities;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BrowserDriver extends EventFiringWebDriver {
    public static String browser = "chrome";

    public BrowserDriver() {
        super(setBrowser());
    }

    private static WebDriver driver = null;

    public static WebDriver setBrowser() {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "F:\\BackUp\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            return driver;
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "F:\\BackUp\\Selenium Drivers\\New\\New folder\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            return driver;
        }
        return driver;
    }


}
