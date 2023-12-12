package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByPosition;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']/a")
    WebElement productArrangement;

    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//button[@type='button']")
    WebElement addToCart;


    public void selectSortByPosition(String value) {
        Reporter.log("Select Sort By Position");
        CustomListeners.test.log(Status.PASS, "Select Sort By Position");
        selectByValueFromDropDown((By) sortByPosition, value);
    }


    public List<WebElement> returnListOfProductNamesElementsLocator() {
        Reporter.log("Return List of Product Name Elements" );
        CustomListeners.test.log(Status.PASS,"Return List of Product Name Elements");
        List<WebElement> listOfElement = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        return listOfElement;
    }


    public void addToCartClick() {
        Reporter.log("Click On Add To Cart" );
        CustomListeners.test.log(Status.PASS,"Click On Add To Cart");
        clickOnElement(addToCart);
    }
}
