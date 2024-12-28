package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Description_ofCalendarPage extends BasePage{

    public Description_ofCalendarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[normalize-space(text())='Activities'])[1]")
    public WebElement activitiesButton;

    @FindBy(xpath = "//span[text()='Calendar Events']")
    public WebElement calendarEventButton;

    @FindBy(xpath = "//div/div[@class='btn-group']/a")
    public WebElement creatCalenderEvent;


    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatButton;

    @FindBy(xpath = "//select[@data-name='recurrence-repeats']")
    public WebElement repeatOption;


    @FindBy(xpath = "(//label[@class='fields-row']/input[@class='recurrence-subview-control__number'])[2]")
    public WebElement repeatEveryInputBox;

    @FindBy(css = "input[value='monday']")
    public WebElement mondaySelectionOption;

    /**
     * iframe -> WebElement textOfDescriptionBody;
     * -> WebElement descriptionInputBody;
     */
    @FindBy(tagName = "iframe")
    public WebElement iframe;

    @FindBy(css = "#tinymce")
    public WebElement descriptionInputBody;

    @FindBy(xpath = "//p[.='This is very nice Event!']")
    public WebElement textOfDescriptionBody;




}
