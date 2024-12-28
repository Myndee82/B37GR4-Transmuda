package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCostPage {

    public VehicleCostPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//th[2]/a/span[1]")
    public WebElement type;



    @FindBy(xpath = "//th[3]/a/span[1]")
    public WebElement totalPrice;

    @FindBy(xpath = "//th[4]/a/span[1]")
    public WebElement date;

    @FindBy(xpath = "//div/button/input")
    public WebElement checkBoxSelectAll;



}
