package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "createAccountButton")
    private WebElement createAccountButton;

    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    @FindBy(id = "submitAccountButton")
    private WebElement submitAccountButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createSavingAccount(String accountName) {
        createAccountButton.click();
        accountNameInput.sendKeys(accountName);
        submitAccountButton.click();
    }
}
