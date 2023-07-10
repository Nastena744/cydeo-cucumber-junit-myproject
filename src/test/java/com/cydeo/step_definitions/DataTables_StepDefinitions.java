package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetables) {
        System.out.println("fruitsAndVegetables = " + fruitsAndVegetables);

    }


    @Then("user should see below the following dogs")
    public void userShouldSeeBelowTheFollowingDogs(List<String>listOfDogs) {
        System.out.println("listOfDogs = " + listOfDogs);
        System.out.println(listOfDogs.get(3));
    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {
        System.out.println("driverInfo = " + driverInfo);
        System.out.println("driverInfo.get(\"address\") = " + driverInfo.get("address"));
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {

        Select month = new Select(dropdownsPage.monthDropdown);
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

        List<String> actualMonth_as_String = new ArrayList<>();
        for(WebElement each:actualMonth_as_WEBELEMENT){
            actualMonth_as_String.add(each.getText());
        }

        List<String> actualMonths = BrowserUtils.dropdownOptions_as_STRING(dropdownsPage.monthDropdown);
        Assert.assertEquals(expectedMonths, actualMonths );

    }
}
