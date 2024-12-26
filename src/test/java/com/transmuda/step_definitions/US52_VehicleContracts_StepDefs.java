package com.transmuda.step_definitions;

import com.transmuda.pages.BasePage;
import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleContractsPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US52_VehicleContracts_StepDefs {

    LoginPage loginPage = new LoginPage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();
    DashboardPage dashboardPage = new DashboardPage();

    Actions actions = new Actions(Driver.getDriver());


    @When("Store Manager user enters valid username {string}")
    public void store_manager_user_enters_valid_username(String username) {
        loginPage.userName.sendKeys(username);

    }
    @And("Store Manager user enters valid password {string}")
    public void store_manager_user_enters_valid_password(String password) {
        loginPage.password.sendKeys(password);
    }
    @And("User should see Dashboard page")
    public void user_should_see_dashboard_page() {
        loginPage.submit.click();

    }


    @And("User clicks on Fleet Module")
    public void user_clicks_on_fleet_module() {
        BrowserUtils.sleep(2);
        actions.moveToElement(dashboardPage.fleetModule).click().perform();

    }
    @And("User select Vehicle Contracts Option")
    public void user_select_vehicle_contracts_option() {
        actions.moveToElement(dashboardPage.vehicleContractsOption).click().perform();
    }

    @Then("User should see Vehicle Contracts Page with title {string}")
    public void user_should_see_vehicle_contracts_page_with_title(String title) {
        BrowserUtils.sleep(5);
        System.out.println(Driver.getDriver().getTitle());
        System.out.println(title);
       BrowserUtils.verifyTitle(title);

    }

    @When("Driver enters username {string}")
    public void driver_enters_username(String username) {
        loginPage.userName.sendKeys(username);
    }
    @And("Driver enters password {string}")
    public void driver_enters_password(String password) {
        loginPage.password.sendKeys(password);
        BrowserUtils.sleep(5);
    }

    @Then("User should see message {string}")
    public void user_should_see_message(String message) {
        String actialNoPermissionMessage = dashboardPage.noPermissionMessage.getText();
        System.out.println(actialNoPermissionMessage);
        Assert.assertTrue(actialNoPermissionMessage.equals(message));
    }


}
