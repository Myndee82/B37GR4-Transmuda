package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US54_EditIconPage {
    public US54_EditIconPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[contains(.,'Fleet')])[1]")
    public WebElement fleetTab;

    @FindBy(xpath = "(//span[contains(.,'Vehicles')])[1]")
    public WebElement vehicle;

    @FindBy(xpath = "(//td[@class='action-cell grid-cell grid-body-cell'])")
    public List<WebElement> treedots;

    @FindBy(xpath = "(//a[@title='Edit'])")
    public List<WebElement> edit;


}
