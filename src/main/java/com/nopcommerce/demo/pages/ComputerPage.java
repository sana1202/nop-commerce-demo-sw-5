package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath="//select[@id='products-orderby']")
    WebElement sortDesktopsPage;

    public void desktopClick() {
        Reporter.log("Click On Desktop" );
        CustomListeners.test.log(Status.PASS,"Click On Desktop");
        clickOnElement(desktop);
    }
}
