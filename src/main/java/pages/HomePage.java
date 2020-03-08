package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    protected WebDriver driver;

    private static final int HOME_PAGE_TIMEOUT = 5;
// Top nav bar
    private By documentation = By.xpath("//*[@id=\"navbar\"]//a[@href=\"/documentation\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public DocumentationPage seeDocumentation() {
        WebDriverWait wait = new WebDriverWait(driver, HOME_PAGE_TIMEOUT);
        wait.until(ExpectedConditions.presenceOfElementLocated(documentation));
        driver.findElement(documentation).click();
        return new DocumentationPage(driver);
    }
}
