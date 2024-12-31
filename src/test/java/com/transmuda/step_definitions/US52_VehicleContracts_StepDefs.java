package com.transmuda.step_definitions;


import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;

import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US52_VehicleContracts_StepDefs {

    // I used browser2=firefox for my test. For running test change property to browser2

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();


    Actions actions = new Actions(Driver.getDriver());





    @And("User clicks on Fleet Module")
    public void user_clicks_on_fleet_module() {
        actions.moveToElement(dashboardPage.fleetModule).click().perform();

    }
    @And("User select Vehicle Contracts Option")
    public void user_select_vehicle_contracts_option() {
        actions.moveToElement(dashboardPage.vehicleContractsOption).click().perform();
    }

    @Then("User should see Vehicle Contracts Page with title {string}")
    public void user_should_see_vehicle_contracts_page_with_title(String title) {
        BrowserUtils.sleep(5);
       BrowserUtils.verifyTitle(title);

    }


    @Then("User should see message {string}")
    public void user_should_see_message(String message) {
        String actialNoPermissionMessage = dashboardPage.noPermissionMessage.getText();
        Assert.assertTrue(actialNoPermissionMessage.equals(message));
    }


}
