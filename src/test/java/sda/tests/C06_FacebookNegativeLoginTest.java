package sda.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import sda.pages.FacebookLoginPage;
import sda.pages.sauceDemo.InventoryPage;
import sda.pages.sauceDemo.LoginPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C06_FacebookNegativeLoginTest {
    //Go to https://www.facebook.com/
//Log in (faker class)
//Test the "Failed to login" message

@Test
    public void test (){

    FacebookLoginPage loginPage =new FacebookLoginPage();
    String url ="https://www.facebook.com/";
    //Go to https://www.facebook.com/
    Driver.getDriver().get(url);
    loginPage.fakerLogin();

    Assert.assertTrue(loginPage.errorMessage.isDisplayed());






}
}
