package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCost {

    public VehicleCost() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement type;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement totalPrice;

    @FindBy(xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement date;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement checkBoxSelectAll;



}
