package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {
    @When("the user navigate to Fleet, Vehicles")
    public void the_user_navigate_to_Fleet_Vehicles() {
        System.out.println("navigate to Fleet Vehicles");
    }

    @Then("the tittle should be Vehicles")
    public void the_tittle_should_be_Vehicles() {
        System.out.println("the tittle should be Vehicles");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("the user navigates to Marketing, Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("expected and actual results are matching");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendar Events")
    public void title_should_be_Calendar_Events() {
        System.out.println("expected and actual results are matching");
    }
}
