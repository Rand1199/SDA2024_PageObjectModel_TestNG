package sda.tests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sda.pages.EBayPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;
public class C09_EbayTest {
    @Test(dataProvider = "getData")
    public void test(String searchKey,int quantity) throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("ebayUrl"));

        EBayPage eBayPage=new EBayPage();
        eBayPage.searchFor(searchKey);
        eBayPage.addFirstItem();
        eBayPage.increaseQuantity(quantity);

        Driver.closeDriver();

    }
    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                {"book",3},
                {"Mirror",2},
                {"black pen",4}
        };

    }
}
