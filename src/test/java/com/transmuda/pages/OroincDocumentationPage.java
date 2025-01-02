package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OroincDocumentationPage {

    public OroincDocumentationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oroplatform-header\"]/div[1]/div/ul/li[1]/a")
    public WebElement questionMark;
}
