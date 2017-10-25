package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StorePage extends BasePage {

    @FindBy(xpath = "//*[contains(text(),'10')]")
    private WebElement sumRadioBtn;

    @FindBy(xpath = "//*[contains(text(),'Купить')]")
    private WebElement continueBtn;

    public StorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public RequestStorePage sendRequestStore(){
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(continueBtn));
        continueBtn.click();
        return new RequestStorePage(driver);
    }


}
