package Steps;

import Utils.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Base {
    @Given("the User is on the homepage")
    public void the_user_is_on_the_homepage() {
        login.verifyCustomerLogin();
    }

    @When("the User Clicks the Customer Login Button")
    public void the_user_clicks_the_customer_login_button() {
        login.clickCustomerLoginButton();
    }

    @When("the User Clicks Dropdown List")
    public void the_user_clicks_dropdown_list() {
        customerPage.initialize();
        customerPage.verifyYourNameText();
        customerPage.clickCustomerDropDown();
    }

    @Then("the User Selects <yourName>")
    public void the_user_selects_your_name() {

    }

    @Then("the User Clicks on Login Button")
    public void the_user_clicks_on_login_button() {

    }

    @Then("Welcome <yourName> !! message is displayed")
    public void welcome_your_name_message_is_displayed() {

    }

    @Then("User Clicks on Account Dropdown List")
    public void user_clicks_on_account_dropdown_list() {

    }

    @Then("Selects Account number")
    public void selects_account_number() {

    }

    @Then("User verifies account balance")
    public void user_verifies_account_balance() {

    }
}
