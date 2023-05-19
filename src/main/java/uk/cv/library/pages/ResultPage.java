package uk.cv.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.cv.library.utility.Utility;


public class ResultPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1")
    WebElement  resultText;

    public boolean verifyTheResults() throws InterruptedException {
        Thread.sleep(2000);
       return resultText.isDisplayed();

    }

}
