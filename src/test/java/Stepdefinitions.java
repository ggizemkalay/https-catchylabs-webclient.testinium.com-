package stepdefinitions;

import base.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver = DriverManager.getInstance().getDriver();
    LoginPage loginPage;

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        loginPage.login("testuser", "testpassword");
    }

    @Then("the user is redirected to the dashboard")
    public void theUserIsRedirectedToTheDashboard() {
        assertTrue(driver.getTitle().contains("Dashboard"));
    }
}

