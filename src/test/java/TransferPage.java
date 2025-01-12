package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage {
    private WebDriver driver;

    @FindBy(id = "transferToInput")
    private WebElement transferToInput;

    @FindBy(id = "amountInput")
    private WebElement amountInput;

    @FindBy(id = "transferButton")
    private WebElement transferButton;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void transferMoney(String toAccount, int amount) {
        transferToInput.sendKeys(toAccount);
        amountInput.sendKeys(String.valueOf(amount));
        transferButton.click();
    }
}
