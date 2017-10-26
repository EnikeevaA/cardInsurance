package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.fail;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.driver=driver;
        if(!driver.getCurrentUrl().equals("http://www.sberbank.ru/ru/person")){
            fail();
        }
    }

    @FindBy(xpath = "//SPAN[@class='benefits-list__title'][text()='Предложения для молодежи']")
    private WebElement youthBtn;

    public static MainPage onMainPage(WebDriver driver){
        return new MainPage(driver);
    }

    public void openYouthPage(){
        youthBtn.click();
    }
}
