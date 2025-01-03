package com.transmuda.step_definitions;

import com.transmuda.pages.US62_FiltersOnMarketingPage;
import com.transmuda.utilities.BrowserUtils;
import com.transmuda.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class US62_FiltersOnMarketingStepDefs {

    US62_FiltersOnMarketingPage filters = new US62_FiltersOnMarketingPage();

    @Given("user is on the home page of application where title is {string}")
    public void user_is_on_the_home_page_of_application_where_title_is(String expectedTitle) {

        BrowserUtils.waitForTitleContains(expectedTitle);
        BrowserUtils.verifyTitle(expectedTitle);

    }
    @Given("user click Marketing module")
    public void user_click_marketing_module() {

       BrowserUtils.waitForClickablility(filters.marketingModule, 5);
       BrowserUtils.sleep(2);
        BrowserUtils.waitForTitleContains("Dashboard");
        BrowserUtils.hover(filters.marketingModule);
        //filters.marketingModule.click();

    }
    @Then("user click Campaigns option")
    public void user_click_campaigns_option() {
    BrowserUtils.waitForTitleContains("Dashboard");
        filters.campaignsOption.click();
    }
    @When("user click Filter icon")
    public void user_click_filter_icon() {

        if (!filters.filterIcon.isSelected()){
            BrowserUtils.sleep(1);
            filters.filterIcon.click();
        }else {
            filters.manageFiltersButton.click();
        }
    }
    @When("user click Manage filters option menu")
    public void user_click_manage_filters_option_menu() {

        filters.manageFiltersButton.click();
    }
    @Then("user see {int} filter options as checked by default")
    public void user_see_filter_options_as_checked_by_default(Integer expectedOptionsSelectedSize) {

        int actualOptionsSelectedSize = filters.getOptionsCountByAttribute(filters.manageFilterOptionsWithTrueAtt, "aria-selected", "true");

        Assert.assertTrue(expectedOptionsSelectedSize.equals(actualOptionsSelectedSize));

    }
    @Then("user can unchecked any amount of checkboxes with {string}")
    public void user_can_unchecked_any_amount_of_checkboxes_with(String attributeValue) {

        for (int attempts = 0; attempts < 3; attempts++) {  // Retry mechanism
            try {
                // Refresh the filter options to ensure they are fresh and up-to-date
                List<WebElement> filterOptions = filters.manageFilterOptions;

                // Iterate through the options to find the matching checkbox by its title
                for (WebElement eachOption : filterOptions) {
                    String title = eachOption.getDomAttribute("title");

                    // If the title matches the provided attribute, uncheck it
                    if (title != null && title.equals(attributeValue)) {
                        // Wait for the element to be clickable (it may be stale or not ready to interact with)
                        BrowserUtils.waitForClickablility(eachOption, 10);

                        // Uncheck the checkbox if it's checked
                        if (eachOption.isSelected()) {
                            BrowserUtils.sleep(1);
                            eachOption.click();
                            System.out.println("Unchecked the checkbox with title: " + title);
                        }
                        // Optional: Assert that the checkbox is unchecked
                        Assert.assertFalse("Checkbox should be unchecked", eachOption.isSelected());
                        return;  // Exit after the checkbox is unchecked
                    }
                }
                // If no matching checkbox was found
                Assert.fail("Could not find the checkbox with attribute: " + attributeValue);
                return;
            } catch (StaleElementReferenceException e) {
                // Retry if a stale element exception occurs
                System.out.println("Stale element exception encountered. Retrying... Attempt " + (attempts + 1));

            }
        }
        // If the checkbox could not be unchecked after 3 attempts, fail the test
        Assert.fail("Could not uncheck the checkbox with attribute: " + attributeValue);

    }

}
