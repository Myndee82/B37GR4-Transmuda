package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPages extends BasePage {

    public  PinbarPages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement learnToUseSpace;

    @FindBy(xpath = "//div[@class='clearfix']//h3")
    public WebElement header1;

    @FindBy(xpath = "//*[@id='container']/div[2]/div/p[1]")
    public WebElement paragraph;

    @FindBy(tagName = "img")
    public WebElement image;


}
