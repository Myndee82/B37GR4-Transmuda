package com.transmuda.step_definitions;

import com.transmuda.pages.Description_ofCalendarPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US58_description_ofCalendarStepDefs {

    Description_ofCalendarPage descriptionOfCalendarPage = new Description_ofCalendarPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));

    @Given("user is on the home page of application and title is {string}")
    public void user_is_on_the_home_page_of_application_and_title_is(String expectedTitle) {

        BrowserUtils.waitForTitleContains(expectedTitle);
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user click Activities button")
    public void user_click_activities_button() {

        descriptionOfCalendarPage.activitiesButton.click();
    }

    @When("user click Calendar Events button")
    public void user_click_calendar_events_button() {

        BrowserUtils.waitForClickablility(descriptionOfCalendarPage.calendarEventButton, 5);

        descriptionOfCalendarPage.calendarEventButton.click();
    }

    @Then("user click Create Calendar Event")
    public void user_click_create_calendar_event() {
/*
       BrowserUtils.waitForVisibility(descriptionOfCalendarPage.creatCalenderEvent, 5);

      BrowserUtils.waitForClickablility(descriptionOfCalendarPage.creatCalenderEvent, 5);

 */
        BrowserUtils.sleep(2);
        descriptionOfCalendarPage.creatCalenderEvent.click();
    }

    @Then("user click repeat button")
    public void user_click_repeat_button() {
        descriptionOfCalendarPage.repeatButton.click();
    }

    @Then("user select from Repeats dropdown {string}")
    public void user_select_from_repeats_dropdown(String selectOption) {
/*
        //   BrowserUtils.waitForVisibility(descriptionOfCalendarPage.repeatOption,  5);
        //   BrowserUtils.waitForClickablility(descriptionOfCalendarPage.repeatOption, 5);

 */
        BrowserUtils.sleep(2);

        Select selectRepeatDropdown = new Select(descriptionOfCalendarPage.repeatOption);

        BrowserUtils.sleep(2);
        selectRepeatDropdown.selectByVisibleText(selectOption);
    }

    @When("user delete and put number and put number of repeats into Repeat Every input box")
    public void user_delete_and_put_number_and_put_number_of_repeats_into_repeat_every_input_box() {

        BrowserUtils.waitForVisibility(descriptionOfCalendarPage.repeatEveryInputBox, 5);

        // Use JavaScript to directly set the value of the input field

        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].value='2';", descriptionOfCalendarPage.repeatEveryInputBox);
    }

    @When("user select the day event has to be repeated")
    public void user_select_the_day_event_has_to_be_repeated() {

        descriptionOfCalendarPage.mondaySelectionOption.click();
    }


    @When("user type into event description description of the event")
    public void user_type_into_event_description_description_of_the_event() {

        Driver.getDriver().switchTo().frame(descriptionOfCalendarPage.iframe);

        BrowserUtils.waitForClickablility(descriptionOfCalendarPage.descriptionInputBody,5);

        descriptionOfCalendarPage.descriptionInputBody.sendKeys("This is very nice Event!" + Keys.ENTER);

        Assert.assertTrue(descriptionOfCalendarPage.textOfDescriptionBody.isDisplayed());

        Driver.getDriver().switchTo().parentFrame();
    }


}
