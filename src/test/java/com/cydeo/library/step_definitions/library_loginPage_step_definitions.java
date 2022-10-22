package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.Library_DashBoardPage;
import com.cydeo.library.pages.Library_LoginPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class library_loginPage_step_definitions {

    Library_LoginPage libraryLoginPage = new Library_LoginPage();
    Library_DashBoardPage library_dashBoardPage = new Library_DashBoardPage();

    @Given("User goes to the log in page of the app")
    public void user_goes_to_the_log_in_page_of_the_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library_login_page"));
    }
    @When("User passes valid librarian email address")
    public void user_passes_valid_librarian_email_address() {
        libraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("librarianUserName"));

    }
    @When("User passes valid librarian password")
    public void user_passes_valid_librarian_password() {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));

    }
    @When("User clicks on Sign in button")
    public void user_clicks_on_sign_in_button() {
       libraryLoginPage.signInButton.click();
    }

    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

        BrowserUtils.waitFor(2);
        //Assert.assertTrue(Driver.getDriver().getTitle().equals("Library"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }


    @When("User passes valid student email address")
    public void user_passes_valid_student_email_address() {
        libraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("studentUserName"));
    }
    @When("User passes valid student password")
    public void user_passes_valid_student_password() {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
    }

    @When("User passes valid librarian {string}")
    public void user_passes_valid_librarian(String librarianUserName) {
        libraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("librarianUserName"));
    }
    @When("User passes valid librarian password {string}")
    public void user_passes_valid_librarian_password(String librarianPassword) {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
    }

    @When("User passes valid student {string}")
    public void user_passes_valid_student(String studentUserName) {
        libraryLoginPage.inputEmail.sendKeys(ConfigurationReader.getProperty("studentUserName"));
    }
    @When("User passes valid student password {string}")
    public void user_passes_valid_student_password_password(String studentPassword) {
        libraryLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("studentPassword"));
    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String librarianUserName, String librarianPassword) {
        libraryLoginPage.logIn(ConfigurationReader.getProperty("librarianUserName"),ConfigurationReader.getProperty("librarianPassword"));
    }
    @Then("There should be {int} users on the page")
    public void there_should_be_users_on_the_page(Integer integer) {

        BrowserUtils.waitFor(3);
        String srt = library_dashBoardPage.usersNumber.getText();// number of user as a string value
        Assert.assertTrue(integer.equals(Integer.parseInt(srt)));

    }

}
