package com.transmuda.step_definitions;

import com.transmuda.pages.LoginPage;
import com.transmuda.pages.US54_EditIconPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class US54_EditCarInfo_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    US54_EditIconPage us54_editIconPage = new US54_EditIconPage();

    @Given("user is log in with the {string} and {string}")
    public void userIsOnLogInWithTheAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user hovers over fleet tab")
    public void userHooversOverFleetTab() {
        BrowserUtils.sleep(3);
        BrowserUtils.hover(us54_editIconPage.fleetTab);
    }

    @Then("user clicks on vehicles tab")
    public void userClicksOnVehiclesTab() {
        BrowserUtils.sleep(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.click(us54_editIconPage.vehicle).perform();
        BrowserUtils.sleep(5);
    }

    @And("user sees the card edit info icons")
    public void userSeesTheCardEditInfoIcons() {
        System.out.println(us54_editIconPage.treedots.size());

        for (int i = 0; i < us54_editIconPage.treedots.size(); i++) {
            BrowserUtils.hover(us54_editIconPage.treedots.get(i));
            BrowserUtils.verifyElementDisplayed(us54_editIconPage.edit.get(i));
            System.out.println(us54_editIconPage.treedots.get(i) + " " + i);
            BrowserUtils.sleep(3);
        }
    }
}


