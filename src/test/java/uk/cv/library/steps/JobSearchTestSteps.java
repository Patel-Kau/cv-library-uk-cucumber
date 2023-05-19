package uk.cv.library.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.cv.library.pages.HomePage;
import uk.cv.library.pages.ResultPage;

/**
 * Created by Kaushik Patel
 */
public class JobSearchTestSteps {
    @Given("^I am on homePage$")
    public void iAmOnHomePage() {
    }

    @When("^I accept cookies$")
    public void iAcceptCookies() throws InterruptedException {
        new HomePage().acceptAllSetting();
    }

    @And("^I enter Job Title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobTitle) throws InterruptedException {
        new HomePage().enterJobTitle(jobTitle);

    }

    @And("^I Enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);

    }

    @And("^I select Distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);

    }

    @And("^I click on more Search Option Link$")
    public void iClickOnMoreSearchOptionLink() throws InterruptedException {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter Min Salary \"([^\"]*)\"$")
    public void iEnterMinSalary(String minSalary) throws InterruptedException {
       new HomePage().enterMinSalary(minSalary);
    }

    @And("^I enter Max Salary \"([^\"]*)\"$")
    public void iEnterMaxSalary(String maxSalary) {
        new HomePage().enterMaxSalary(maxSalary);

    }

    @And("^I select salary Type \"([^\"]*)\"$")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);

    }

    @And("^I select Job Type \"([^\"]*)\"$")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);

    }

    @And("^I click on find job button$")
    public void iClickOnFindJobButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("^Verify the search result is display$")
    public void verifyTheSearchResultIsDisplay() throws InterruptedException {
        Assert.assertTrue(new ResultPage().verifyTheResults());
    }
}