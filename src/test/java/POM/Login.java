package POM;

import Utilities.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login(BrowserDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"mountRoot\"]/div/div/div/div/form/fieldset[1]/div[1]/input")
    WebElement usernameField;


    public WebElement getUsernameField(){
        return usernameField;
    }
}
