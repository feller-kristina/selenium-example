package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUtils {

    public static WebDriver getWebDriver() {
        String browser = System.getProperty("browser", "chrome");
        switch (browser) {
            case "firefox":
                return new FirefoxDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "chromedriver");
                return new ChromeDriver();
        }
    }

}
