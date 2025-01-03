package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //locators for Driver,Sales and Store Manager
    @FindBy(linkText = "Fleet")
    public WebElement fleetModule;

    @FindBy (linkText = "Customers")
    public WebElement customersModule;

    @FindBy (linkText = "Activities")
    public WebElement activitiesModule;

    @FindBy(linkText = "System")
    public WebElement systemModule;

    @FindBy(linkText = "Dashboards")
    public WebElement dashboardsModule;

    @FindBy(linkText = "Sales")
    public WebElement salesModule;

    @FindBy(linkText = "Reports & Segments")
    public WebElement reportsSegmentsModule;

    @FindBy(linkText = "Marketing")
    public WebElement marketingModule;





    @FindBy (xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractsOption;

    @FindBy (xpath = "//span[.='Vehicle Costs']")
    public WebElement vehicleCost;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement noPermissionMessage;









}
