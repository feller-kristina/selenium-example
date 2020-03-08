package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {

    protected WebDriver driver;
    protected Environment environment;

    @Before
    public void setUp() {
        environment = Environment.getEnvironment();
        System.err.println(environment.url);
        driver = WebDriverUtils.getWebDriver();
        driver.get(environment.url);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
