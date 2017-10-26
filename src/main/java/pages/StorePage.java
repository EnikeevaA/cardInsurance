package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BasePage {

    @FindBy(xpath = "//A[@class='b-continue-btn'][text()='Купить']")
    private WebElement continueBtn;

    public StorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void sendRequestStore()throws InterruptedException{
        //Вылетает на этом месте
        continueBtn.click();
    }


}
