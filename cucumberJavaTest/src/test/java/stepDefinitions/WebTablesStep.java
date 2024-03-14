package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class WebTablesStep {
    private WebDriver driver;
    private WebDriverWait wait;
    private WebTablesPage webTablesPage;
    private AddUserPage addUserPage;

    @Given("I open the web tables page")
    public void openWebTablesPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webTablesPage = new WebTablesPage(driver);
        webTablesPage.open();
    }

    @When("I add a user with following details")
    public void addUserToTable(Map<String, String> userData) {
        webTablesPage.clickAddUserButton();
        addUserPage = new AddUserPage(driver);
        addUserPage.addUser(userData);
        webTablesPage.clickSaveButton();
    }

    @Then("the user {string} should be displayed in the table")
    public void verifyUserDisplayed(String username) {
        // Add verification steps if needed
    }

    @When("I delete the user {string} from the table")
    public void deleteUserFromTable(String username) {
    	 WebElement row = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='" + username + "']/parent::tr")));
    	 row.findElement(By.xpath(".//td//i[@class='icon icon-remove']")).click();
    	 //displaying popup is not an alert so directly clciking 
        WebElement popupokbutton= driver.findElement(Locators.POPUP_OK_BUTTON);
         wait.until(ExpectedConditions.elementToBeClickable(popupokbutton)).click();
    }

    @Then("the user {string} should not be displayed in the table")
    public void verifyUserNotDisplayed(String username) {
    	 List<WebElement> users = driver.findElements(Locators.Dynamic_User);
         assertTrue(users.isEmpty());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
