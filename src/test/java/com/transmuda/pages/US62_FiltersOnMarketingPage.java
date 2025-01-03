package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US62_FiltersOnMarketingPage extends BasePage {

    public US62_FiltersOnMarketingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[normalize-space(text())='Marketing'])[1]")
    public WebElement marketingModule;

    @FindBy(xpath = "(//span[.='Campaigns'])[1]")
    public WebElement campaignsOption;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filterIcon;

    @FindBy(xpath = "//button/a[.='Manage filters']")
    public WebElement manageFiltersButton;


    @FindBy(xpath = "//ul/li/label/input[@aria-selected='true']")
    public List<WebElement>manageFilterOptionsWithTrueAtt;

    @FindBy(xpath = "//label[@title='Code']")
    public WebElement selectedOptionCode;

    @FindBy(xpath = "//label[@title='Start Date']")
    public WebElement selectedOptionStartDate;


    @FindBy(xpath = "//label/input[@type='checkbox']")
    public List<WebElement>manageFilterOptions;

    public static int getOptionsCountByAttribute(List<WebElement> list, String attribute, String expectedValue){

        int count = 0;

        for (WebElement eachElement : list) {

            if (eachElement.getDomAttribute(attribute).equals(expectedValue));
            count++;
        }
        return count;
    }





}
