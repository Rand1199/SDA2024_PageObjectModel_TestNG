package sda.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import sda.utilities.Driver;

public class FacebookLoginPage {
    public FacebookLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "email")
    public WebElement emailField;

    @FindBy(id="pass")
    public WebElement passwordField;

    @FindBy(name= "login")
    public WebElement LoginButton;

    @FindBy(partialLinkText = "Find your account")
    public WebElement errorMessage;

    public void fakerLogin(){
        Faker faker =new Faker();
        emailField.sendKeys(faker.internet().emailAddress());
        passwordField.sendKeys(faker.internet().password());
    }


}
