package com.transmuda.step_definitions;

import com.transmuda.pages.OroincDocumentationPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class US50_OroincDocumentationPage_StepDef {

    OroincDocumentationPage oroincDocumentationPage = new OroincDocumentationPage();

    @Then("user is clicking the question mark icon")
    public void user_is_clicking_the_question_mark_icon() {
        String mainHandle = Driver.getDriver().getWindowHandle();
        oroincDocumentationPage.questionMark.click();

    }

    @Then("user should be able to see Oroinc Documentation Page")
    public void user_should_be_able_to_see_oroinc_documentation_page() {
        BrowserUtils.sleep(3);
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getCurrentUrl().equals("https://doc.oroinc.com/")) {
                break;
            }
        }


        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println(actualURL);

        String expectedURL = "https://doc.oroinc.com/";
        System.out.println("expectedURL = " + expectedURL);

        Assert.assertEquals(expectedURL, actualURL);
    }


}
