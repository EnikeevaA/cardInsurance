package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YouthPage extends BasePage {

    @FindBy(xpath = "(//A[@href='/ru/person/sberbank-youth/zashhita_molodezhnoj_karty'][text()='Защита карты'])[4]")
    private WebElement protectBtn;

    public YouthPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void openProtectPage() throws InterruptedException{
        protectBtn.click();
    }
}
