package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.ExercisePage;

public class ExercisesSteps {
    ExercisePage exercise = new ExercisePage();

    @Given("^than the user navigate to 'https://automationexercise.com/'$")
    public void navigateToHomePage() {
        exercise.navigateToHomePage();
    }

    @And("^he verifies that the home page is visible succesfully$")
    public void verifyHomePageVisibility() {
        Assert.assertTrue(exercise.verifyHomePageVisibility());
    }

    @And("^he clicks on 'Signup/Login' link$")
    public void clickSignupLink() {
        exercise.clickSignupLink();
    }

    @And("^he verifies that the text 'New User Signup' is visible$")
    public void verifyNewUserSignupIsVisible() {
        Assert.assertEquals("New User Signup!", exercise.verifyNewUserSignupIsVisible());
    }

    @And("^he enters name (.*) and email (.*) address$")
    public void fillSignupForm(String name, String email) {
        exercise.fillSignupForm(name, email);
    }

    @When("^he clicks on 'Signup' button$")
    public void clickSignupButton() {
        exercise.clickSignupButton();
    }

    @And("^he verifies that 'ENTER ACCOUNT INFORMATION' is visible$")
    public void checkEnterAccountVisivility() {
        Assert.assertEquals("ENTER ACCOUNT INFORMATION", exercise.checkEnterAccountVisivility());
    }

    @And("^he fills the all the form with the correct required params Password (.*), Date of birth, First name (.*), Last name (.*), Address (.*), Country (.*), State (.*), City (.*), Zipcode (.*), Mobile Number (.*)$")
    public void fillForm(String pass, String firstName, String lastName, String address, String country, String state,
            String city, String cp, String number) {
        exercise.fillForm(pass, firstName, lastName, address, country, state, city, cp, number);
    }

    @And("^he clicks on the 'create account' button$")
    public void clickCreateAccountButton() {
        exercise.clickCreateAccountButton();
    }

    @And("^he Verifies that 'ACCOUNT CREATED!' is visible$")
    public void checkAccountCreatedIsVisible() {
        Assert.assertEquals("ACCOUNT CREATED!", exercise.checkAccountCreatedIsVisible());
    }

    @Then("^he clicks on 'Continue' button$")
    public void clickContinueButton() {
        exercise.clickContinueButton();
    }

    @And("^he verifies that 'Logged in as username' (.*) is visible$")
    public void checkLoggedInAsUsernameIsVisible(String name) {
        Assert.assertEquals("Logged in as " + name + "", exercise.checkLoggedInAsUsernameIsVisible());
    }

    @And("^he clicks on 'Delete Account' button$")
    public void clickDeleteAccountLink() {
        exercise.clickDeleteAccountLink();
    }

    @And("^he verifies that 'ACCOUNT DELETED!' is visible and click 'Continue' button$")
    public void checkAccountDeletedIsVisible() {
        Assert.assertEquals("ACCOUNT DELETED!", exercise.checkAccountDeletedIsVisible());
    }

    // Scenario: As a user i want to login with correct email and password
    // Steps

    @And("^the user clicks on 'signup/login' link$")
    public void clickSignupLink2() {
        exercise.clickSignupLink();
    }

    @When("^he verifies 'Login to your account' is visible$")
    public void checkLoginIsVisible() {
        Assert.assertEquals("Login to your account", exercise.checkLoginIsVisible());
    }

    @And("^the user enter the correct email (.*) and password (.*)$")
    public void fillLoginForm(String email, String pass) {
        exercise.fillLoginForm(email, pass);
    }

    @Then("^he clicks 'login' button$")
    public void clickLoginButton() {
        exercise.clickLoginButton();
    }

    @And("^he verifies that 'Logged in as username' (.*) is visible in the page$")
    public void checkLogedIsVisible(String name) {
        Assert.assertEquals("Logged in as " + name + "", exercise.checkLoggedInAsUsernameIsVisible());
    }

}