package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTitleLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_1")
    WebElement processorDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_2")
    WebElement ramDropdownLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_3_7")
    WebElement hddRadioButtonLocator;

    @CacheLookup
    @FindBy(css="#product_attribute_4_9")
    WebElement osRadioButtonLocator;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_attribute_5_10'])[1]")
    WebElement msOfficeCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//input[@id='product_attribute_5_12'])[1]")
    WebElement totalCommanderCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//span[@id='price-value-1'])[1]")
    WebElement priceTotalLocator;

    @CacheLookup
    @FindBy(xpath="//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;

    @CacheLookup
    @FindBy(css=".content")
    WebElement messageConfirmationLocator;

    @CacheLookup
    @FindBy(xpath="//span[@title='Close']")
    WebElement crossToCloseLocator;


    public String getTextFromBuildYourOwnComputer() {
        Reporter.log("Get Text From Build Your Own Product Title" );
        CustomListeners.test.log(Status.PASS,"Get Text From Build Your Own Product Title");
        return getTextFromElement(buildYourOwnComputerTitleLocator);

    }

    public void selectProcessor(){
        Reporter.log("Select Processor" );
        CustomListeners.test.log(Status.PASS,"Select Processor");
        selectByIndexFromDropDown((By) processorDropdownLocator, 1);

    }
    public void selectRAM(){
        Reporter.log("Select RAM" );
        CustomListeners.test.log(Status.PASS,"Select RAM");
        selectByIndexFromDropDown((By) ramDropdownLocator, 3);

    }
    public void selectHDD()
    {
        Reporter.log("Select HDD" );
        CustomListeners.test.log(Status.PASS,"Select HDD");
        clickOnElement(hddRadioButtonLocator);
    }

    public void selectOS()
    {
        Reporter.log("Select OS" );
        CustomListeners.test.log(Status.PASS,"Select OS");
        clickOnElement(osRadioButtonLocator);
    }

    public void selectMicrosoftOffice() {
        Reporter.log("Select MS Office" );
        CustomListeners.test.log(Status.PASS,"Select MS Office");
        WebElement element = driver.findElement(By.cssSelector("#product_attribute_5_10"));
        if (!element.isSelected()) {
            clickOnElement(msOfficeCheckBoxLocator);
        }
    }
    public void selectTotalCommander(){
        Reporter.log("Select Total Commander" );
        CustomListeners.test.log(Status.PASS,"Select Total Commander");
        clickOnElement(totalCommanderCheckBoxLocator);
    }

    public String checkTotalPrice(){
        Reporter.log("Check Total Price" );
        CustomListeners.test.log(Status.PASS,"Check Total Price");
        return getTextFromElement(priceTotalLocator);
    }

    public void addToCartButtonClick(){
        Reporter.log("Click on Add to Cart Button" );
        CustomListeners.test.log(Status.PASS,"Click on Add to Cart Button");
        clickOnElement(addToCartButton1Locator);

    }

    public String shoppingCartMessage(){
        Reporter.log("Shopping Cart Msg" );
        CustomListeners.test.log(Status.PASS,"Shopping Cart Error Msg");
        return getTextFromElement(messageConfirmationLocator);

    }

    public void crossBarClick(){
        Reporter.log("Click on Cross Bar" );
        CustomListeners.test.log(Status.PASS,"Click On Cross Bar");
        clickOnElement(crossToCloseLocator);
    }
}
