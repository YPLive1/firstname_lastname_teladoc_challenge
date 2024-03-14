package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class AddUserPage {
    private WebDriver driver;

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addUser(Map<String, String> userData) {
        driver.findElement(Locators.FIRST_NAME).sendKeys(userData.get("firstName"));
        driver.findElement(Locators.LAST_NAME).sendKeys(userData.get("lastName"));
        driver.findElement(Locators.USERNAME).sendKeys(userData.get("userName"));
        driver.findElement(Locators.PASSWORD).sendKeys(userData.get("password"));
        driver.findElement(Locators.Radio_Button).click();
        driver.findElement(Locators.ROLE_DROPDOWN).click();
        new Select(driver.findElement(Locators.ROLE_DROPDOWN)).selectByVisibleText(userData.get("role"));
        driver.findElement(Locators.EMAIL).sendKeys(userData.get("email"));
        driver.findElement(Locators.MOBILEPHONE).sendKeys(userData.get("mobilephone"));
    }
}
