package com.manoj.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ScenariosType {
    static int i =0;
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
    }
    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        System.out.println("I should be logged in successfully");
    }


    @Given("I am on the product page")
    public void i_am_on_the_product_page() {
    }

    @When("I add the following products to the cart:")
    public void i_add_the_following_products_to_the_cart(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<Map<String,String>> map= dataTable.asMaps();
        for (Map<String, String> m : map){
            System.out.println("Product Name in " + i + " iteration " + m.get("Product Name"));
            System.out.println("Quantity  in " + i  + " iteration " + m.get("Quantity"));
            System.out.println("Available  in " + i  + " iteration " + m.get("Available"));
        }

        List<List<String>> users = dataTable.asLists(String.class);
        for (int j = 1; j < users.size(); j++) { // Note first row(0 index ) is header ignore it while using in test
            List<String> userCred = users.get(j);
            String productName = userCred.get(0);
            String quantity = userCred.get(1);
            String available = userCred.get(2);
            System.out.println(productName + " " + quantity + " " + available);
        }
    }
    @Then("the cart should contain all added products")
    public void the_cart_should_contain_all_added_products() {
    }
    //Eamples

    @When("I enter {string} and {string}")
    public void i_enter_user1_and_pass1(String userName, String password) {
        //Cannot use Data table in scenario outline
//        List<Map<String,String>> map= dataTable.asMaps();
//        for (Map<String, String> m : map){
//            System.out.println("Product Name in " + i + " iteration " + m.get("username"));
//            System.out.println("Quantity  in " + i  + " iteration " + m.get("password"));
//        }
        System.out.println(userName + " " + password);
    }

    @Then("I should see {string}")
    public void i_should_see(String string) {
        System.out.println(string);
    }
}
