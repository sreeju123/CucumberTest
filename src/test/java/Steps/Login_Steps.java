package Steps;

import POM.Login;
import Utilities.BrowserDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class Login_Steps {

    BrowserDriver driver;

    public Login_Steps(BrowserDriver driver) {
        this.driver = driver;
    }

    @After
    public void TearDown() {
        driver.quit();
    }

    @When("^I launch Myntra$")
    public void i_launch_Myntra() {
        driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
        driver.manage().window().maximize();
    }

    @And("^I enter Username$")
    public void i_enter_Username() {
        Login login=new Login(driver);
        login.getUsernameField().sendKeys("Sreejith");
    }
}
