package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(linkText = "Fleet")
    public WebElement fleetModule;



    @FindBy (xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractsOption;

    @FindBy (xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noPermissionMessage;

}
