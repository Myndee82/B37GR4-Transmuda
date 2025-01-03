package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class US49_accessing_main_modules_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    //AC testing as a store manager
    @Given("store manager is on the login page of the fleet application")
    public void store_manager_is_on_the_login_page_of_the_fleet_application() {
        Driver.getDriver().get("http://qa.transmuda.com/");
    }

    @When("store manager enters username {string}")
    public void store_manager_enters_username(String store_manager_username) {
        loginPage.userName.sendKeys(store_manager_username);

    }

    @When("store manager enters password  {string}")
    public void store_manager_enters_password(String store_manager_password) {
        loginPage.password.sendKeys(store_manager_password);

    }

    @When("store manager clicks login button")
    public void store_manager_clicks_login_button() {
        loginPage.submit.click();

    }

    @Then("store manager should see the modules name")
    public void store_manager_should_see_the_modules_name(List<String> expectedModulesStoreManager) {

        List<String> actualModules = Arrays.asList(
                dashboardPage.dashboardsModule.getText(),
                dashboardPage.fleetModule.getText(),
                dashboardPage.customersModule.getText(),
                dashboardPage.salesModule.getText(),
                dashboardPage.activitiesModule.getText(),
                dashboardPage.marketingModule.getText(),
                dashboardPage.reportsSegmentsModule.getText(),
                dashboardPage.systemModule.getText());

        Assert.assertEquals(actualModules,expectedModulesStoreManager);

    }


    // AC1 Testing as a sales manager
    @Given("sales manager is on the login page of the fleet application")
    public void sales_manager_is_on_the_login_page_of_the_fleet_application() {
        Driver.getDriver().get("http://qa.transmuda.com/");
    }


    @When("sales manager enters username {string}")
    public void sales_manager_enters_username(String sales_manager_username) {
        loginPage.userName.sendKeys(sales_manager_username);
    }


    @When("sales manager enters password  {string}")
    public void sales_manager_enters_password(String sales_manager_password) {
        loginPage.password.sendKeys(sales_manager_password);
    }


    @When("sales manager clicks login button")
    public void sales_manager_clicks_login_button() {
        loginPage.submit.click();
    }

    @Then("sales manager should see the modules name")
    public void sales_manager_should_see_the_modules_name(List<String> expectedModulesSalesManager) {

        List<String> actualModules = Arrays.asList(
                dashboardPage.dashboardsModule.getText(),
                dashboardPage.fleetModule.getText(),
                dashboardPage.customersModule.getText(),
                dashboardPage.salesModule.getText(),
                dashboardPage.activitiesModule.getText(),
                dashboardPage.marketingModule.getText(),
                dashboardPage.reportsSegmentsModule.getText(),
                dashboardPage.systemModule.getText());

        Assert.assertEquals(actualModules,expectedModulesSalesManager);

    }


    //AC2 Testing as a driver
    @Given("driver is on the login page of the fleet application")
    public void driver_is_on_the_login_page_of_the_fleet_application() {
        Driver.getDriver().get("http://qa.transmuda.com/");

    }

    @When("driver enters username {string}")
    public void driver_enters_username(String driver_username) {
        loginPage.userName.sendKeys(driver_username);

    }

    @When("driver enters password {string}")
    public void driver_enters_password(String driver_password) {
        loginPage.password.sendKeys(driver_password);
    }

    @When("driver clicks login button")
    public void driver_clicks_login_button() {
        loginPage.submit.click();
    }

    @Then("driver should see modules name")
    public void driver_should_see_modules_name(List<String> expectedModulesDriver) {

        BrowserUtils.waitForPageToLoad(3);

        List<String> actualModules = Arrays.asList(
                dashboardPage.fleetModule.getText(),
                dashboardPage.customersModule.getText(),
                dashboardPage.activitiesModule.getText(),
                dashboardPage.systemModule.getText());

        Assert.assertEquals(actualModules,expectedModulesDriver);
    }

}
