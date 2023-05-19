package uk.cv.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.cv.library.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAll;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleElement;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='location'])[1]")
    WebElement locationElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDownElement;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLinkElement;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMinElement;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMaxElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDownElement;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDownElement;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtnElement;


    public void acceptAllSetting() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAll);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle) throws InterruptedException {
        Thread.sleep(1000);
        log.info("Enter Job Title " + jobTitleElement.toString());

        sendTextToElement(jobTitleElement, jobTitle);

    }

    public void enterLocation(String location) {
        log.info("Enter Location " + locationElement.toString());

        sendTextToElement(locationElement, location);

    }

    public void selectDistance(String distance) {
        log.info("Select Distance " + distanceDropDownElement.toString());

        selectByVisibleTextFromDropDown(distanceDropDownElement, distance);

    }

    public void clickOnMoreSearchOptionLink() throws InterruptedException {
        Thread.sleep(1000);
log.info("Click on more search option link " + moreSearchOptionsLinkElement.toString());
        mouseHoverToElementAndClick(moreSearchOptionsLinkElement);

    }

    public void enterMinSalary(String minSalary) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Enter minimum salary " + minSalary.toString());
        sendTextToElement(salaryMinElement, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Enter Maximum salary "+ maxSalary.toString());
        sendTextToElement(salaryMaxElement, maxSalary);
    }

    public void selectSalaryType(String sType) {
        log.info("Select salary type " + salaryTypeDropDownElement.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDownElement, sType);
    }

    public void selectJobType(String jobType) {
        log.info("Select job type "+ jobType.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDownElement, jobType);
    }

    public void clickOnFindJobsButton() {
        log.info("Click on find job Button " + findJobsBtnElement.toString());
        clickOnElement(findJobsBtnElement);

    }


}
