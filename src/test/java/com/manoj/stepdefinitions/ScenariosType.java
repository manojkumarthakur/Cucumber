package com.manoj.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenariosType {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("I am on the login page");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("I enter {string} as username and {string} as password")
    public void i_enter_as_username_and_as_password(String userName, String password) {
        System.out.println(String.format("I enter %s as username", userName));
        System.out.println(String.format("I enter %s as password", password));
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("I should be logged in successfully");
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

}
