package stepDefinitions;

import org.openqa.selenium.By;

public class Locators {
    // WebTablesPage Locators
    public static final By ADD_USER_BUTTON = By.id("bAdd");
    public static final By SAVE_BUTTON = By.name("SaveID");
    public static final By POPUP_OK_BUTTON = By.xpath("//button[contains(text(),'OK')]");
    public static final By FIRST_NAME = By.name("FirstName");
    public static final By LAST_NAME = By.name("LastName");
    public static final By USERNAME = By.name("UserName");
    public static final By PASSWORD = By.name("Password");
    public static final By Radio_Button = By.cssSelector("input[type='radio'][value='15']");
    public static final By ROLE_DROPDOWN = By.name("RoleId");  
    public static final By EMAIL = By.name("Email");
    public static final By MOBILEPHONE = By.name("Mobilephone");
	private static final String username = null;
    public static final By Dynamic_User = By.xpath("//td[text()='" + username + "']");
    
}
