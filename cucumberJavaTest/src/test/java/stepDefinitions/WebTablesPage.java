package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADD_USER_BUTTON));
    }

    public void clickAddUserButton() {
        driver.findElement(Locators.ADD_USER_BUTTON).click();
    }

    public void clickSaveButton() {
        driver.findElement(Locators.SAVE_BUTTON).click();
    }

    public void clickOkButton() {
        driver.findElement(Locators.POPUP_OK_BUTTON).click();
    }
}
