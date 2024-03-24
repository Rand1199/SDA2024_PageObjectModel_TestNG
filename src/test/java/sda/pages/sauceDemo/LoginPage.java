package sda.pages.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sda.utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "user-name")
    public WebElement usernameField;

    @FindBy(id="password")
    public WebElement passwordField;

    @FindBy(id= "login-button")
    public WebElement LoginButton;

    public void login(String name , String password){
        usernameField.sendKeys(name);
        passwordField.sendKeys(password);
        LoginButton.click();
    }
}
