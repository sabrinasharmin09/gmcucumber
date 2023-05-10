package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page.CreateNewGooglePage;

public class homepageSteps {
    WebDriver driver =StepBase.driver;
    CreateNewGooglePage cnp;


    @Given("I am in homepage {string}")
    public void i_am_in_homepage(String url) {
        // Write code here that turns the phrase above into concrete actions
      driver.get(url);
    }
    @When("I type {string}")
    public void i_type(String firstname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     cnp=new CreateNewGooglePage(driver);
     cnp.typefirstname(firstname);
    }

    @When("I type {string} last")
    public void i_type_last(String lastname) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       cnp = new CreateNewGooglePage(driver);
       cnp.typeLastname(lastname);
    }
    @When("I type {string} email")
    public void i_type_email(String email) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     cnp.typeEmail(email);
    }
    @When("I type {string} pass")
    public void i_type_pass(String password) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
      cnp.typePassword(password);
    }
    @When("I type {string} re")
    public void i_type_re(String reEnterPassword) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cnp.typeRePassword(reEnterPassword);
    }

    @When("I click on checkbox")
    public void i_click_on_checkbox() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     cnp.typeCheckBox();
    }
    @When("I click on next")
    public void i_click_on_next() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     cnp.typeClickNext();
    }

    @When("I verify the {string}")
    public void i_verify_the(String phonenumber) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       cnp.typePhone(phonenumber);
    }

    @When("I click on next again")
    public void i_click_on_next_again() {
        // Write code here that turns the phrase above into concrete actions
     cnp.clickNext1();
    }

    @Then("I verify the <status> in step")
    public void i_verify_the_status_in_step() {
        // Write code here that turns the phrase above into concrete actions

    }
}
