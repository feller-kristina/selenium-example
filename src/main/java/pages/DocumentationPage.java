package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocumentationPage {

    protected WebDriver driver;

    private By logo = By.id("logo");

    public DocumentationPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.urlContains("documentation"));
    }

    public boolean logo_is_visible() {
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.presenceOfElementLocated(logo));
        return driver.findElement(logo).isDisplayed();
    }
}
