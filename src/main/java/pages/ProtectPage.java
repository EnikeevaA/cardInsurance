package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProtectPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'Оформить онлайн')]")
    private WebElement storeBtn;

    public ProtectPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openStorePage()throws InterruptedException{
        storeBtn.click();
    }
}
