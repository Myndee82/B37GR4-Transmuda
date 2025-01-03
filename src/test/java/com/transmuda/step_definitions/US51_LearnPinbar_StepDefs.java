package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.PinbarPages;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US51_LearnPinbar_StepDefs {

    PinbarPages pinbarPages = new PinbarPages();
    LoginPage login = new LoginPage();

    @Given("user is on homepage")
    public void user_is_on_homepage() {

        login.userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        login.password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        login.submit.click();



    }
    @When("user click on learn how to use this space link")
    public void user_click_on_learn_how_to_use_this_space_link() {


        BrowserUtils.clickWithJS(pinbarPages.learnToUseSpace);
        
    }
    
    @Then("user should see {string} and user should see use the text {string}")
    public void userShouldSeeAndUserShouldSeeUseTheText(String arg0, String arg1) {
        String actualheader = pinbarPages.header1.getText();
        String  par = pinbarPages.paragraph.getText();
        BrowserUtils.verifyElementDisplayed(pinbarPages.header1);

        BrowserUtils.verifyElementDisplayed(pinbarPages.paragraph);

        System.out.println(actualheader + " is displayed");
        System.out.println(par + " is displayed");
    }

    @Then("user should see an image with src {string}")
    public void userShouldSeeAnImageWithSrc(String arg0) {


        BrowserUtils.clickWithJS(pinbarPages.learnToUseSpace);

        BrowserUtils.verifyElementDisplayed(pinbarPages.image);


    }
}
