package com.transmuda.step_definitions;

import com.transmuda.pages.DashboardPage;
import com.transmuda.pages.LoginPage;
import com.transmuda.pages.VehicleCostPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;



import java.util.Arrays;
import java.util.List;



public class US61_VehicleCost_StepDefs {
    LoginPage loginPage = new LoginPage();
    VehicleCostPage vehicleCostPage = new VehicleCostPage();
    DashboardPage dashboardPage = new DashboardPage();

    Actions actions = new Actions(Driver.getDriver());


    @And("User select Vehicle Cost Option")
    public void user_select_vehicle_cost_option() {
        actions.moveToElement(dashboardPage.vehicleCost).click().perform();
    }

    @Then("Verify columns name")
    public void verify_columns_name(List<String> columnNames) {

        // List of actual column names from the web elements

        BrowserUtils.sleep(5);


        List<String> actualColumnNames = Arrays.asList(
                vehicleCostPage.type.getText(),
                vehicleCostPage.totalPrice.getText(),
                vehicleCostPage.date.getText()
        );


        // Assert that the actual column names match the expected column names

        Assert.assertEquals("Column names do not match!", columnNames, actualColumnNames);


    }

    @Then("User select first checkbox to select All Vehicle Costs")
    public void user_select_first_checkbox_to_select_all_vehicle_costs() {
        BrowserUtils.sleep(5);
        BrowserUtils.selectCheckBox(vehicleCostPage.checkBoxSelectAll, true);
        Assert.assertTrue(vehicleCostPage.checkBoxSelectAll.isSelected());
    }



}
