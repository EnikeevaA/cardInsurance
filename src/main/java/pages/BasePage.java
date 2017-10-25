package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

abstract class BasePage {
    WebDriver driver;

    void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }

    void checkFieldText(WebElement element, String text){
        String expectedText=element.getText();
        if(expectedText.equals("")){
            expectedText=element.getAttribute("value");
        }
        Assert.assertEquals(expectedText,text);
    }
}
