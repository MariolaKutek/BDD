import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GuruBankStepsDef {
    @Given("Home page is opened")
    public void homePageIsOpened() {
        System.out.println("Home page is opened");
    }
    @When("I fill UserID field {string}")
    public void iFillUserIDField(String arg0) {
        System.out.println(String.format("I fill UserID field %s", arg0));
    }
    @And("I fill Password field {string}")
    public void iFillPasswordField(String arg0) {
        System.out.println(String.format("I fill Password field %s", arg0));
    }
    @And("I click Login button")
    public void iClickLoginButton() {
        System.out.println("I click Login button");
    }
    @Then("I can see page for authenticated user")
    public void iCanSeePageForAuthenticatedUser() {
        System.out.println("I can see page for authenticated user");
    }
    @Then("Error message is visible {string}")
    public void errorMessageIsVisible(String arg0) {
        System.out.println(String.format("Error message is visible %s", arg0));
    }
    @And("I click Reset button")
    public void iClickResetButton() {
        System.out.println("I click Reset button");
    }
}
