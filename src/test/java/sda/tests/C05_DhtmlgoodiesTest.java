package sda.tests;

import org.testng.annotations.Test;
import sda.pages.DhtmlgoodiesPage;
import sda.utilities.ConfigReader;
import sda.utilities.Driver;

public class C05_DhtmlgoodiesTest {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
// Fill in capitals by country.
    @Test
    public void test(){
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        // Fill in capitals by country.

        Driver.getDriver().get(ConfigReader.getProperty("dhtmlgoodiesUrl"));
        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();

        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Madrid","Spain");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Washington","United States");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Rome","Italy");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Seoul","South Korea");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Copenhagen","Denmark");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Oslo","Norway");
        dhtmlgoodiesPage.dragCapitolInCountryBoxInTheirPlaces("Stockholm","Sweden");

    }
}
