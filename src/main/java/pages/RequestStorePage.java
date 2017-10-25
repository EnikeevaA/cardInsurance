package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class RequestStorePage extends BasePage {
    public RequestStorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(name = "surname")
    private WebElement surname;

    @FindBy(name = "name")
    private WebElement name;

    @FindBy(name = "middlename")
    private WebElement middlename;

    @FindBy(name = "birthDate")
    private WebElement birthDate;

    @FindBy(name = "male")
    private WebElement maleBtn;

    @FindBy(name = "passport_series")
    private WebElement passport_series;

    @FindBy(name = "passport_number")
    private WebElement passport_number;

    @FindBy(name = "issueDate")
    private WebElement issueDate;

    @FindBy(name = "issuePlace")
    private WebElement issuePlace;

    @FindBy(name = "regAddress_region_kladrInput")
    private WebElement regAddress_region_kladrInput;

    @FindBy(name = "regAddress_street_kladrInput")
    private WebElement regAddress_street_kladrInput;

    @FindBy(name = "regAddress_house")
    private WebElement regAddress_house;

    @FindBy(xpath = "//*[contains(@class,'b-continue-btn')]")
    private WebElement continueBtn;

    @FindBy(xpath = "//SPAN[@ng-show='tryNext && myForm.$invalid'][text()='Заполнены не все обязательные поля']")
    private WebElement validationError;

    public RequestStorePage fillRequest(){
        fillField(surname,"Иванов");
        fillField(name,"Иван");
        fillField(middlename,"Иванович");
        fillField(birthDate,"15.02.1995");
        maleBtn.click();
        fillField(passport_series,"1234");
        fillField(passport_number,"456789");
        fillField(issueDate,"01.02.2015");
        fillField(regAddress_region_kladrInput,"Москва");
        fillField(regAddress_street_kladrInput,"улица");
        fillField(regAddress_house,"1");
        continueBtn.click();
        return this;
    }

    public RequestStorePage checkInputDate(){
        checkFieldText(surname,"Иванов");
        checkFieldText(name,"Иван");
        checkFieldText(middlename,"Иванович");
        checkFieldText(birthDate,"15.02.1995");
        checkFieldText(passport_series,"1234");
        checkFieldText(passport_number,"456789");
        checkFieldText(issueDate,"01.02.2015");
        checkFieldText(regAddress_region_kladrInput,"Москва");
        checkFieldText(regAddress_street_kladrInput,"улица");
        checkFieldText(regAddress_house,"1");
        checkFieldText(validationError,"Заполнены не все обязательные поля");
        return this;
    }
}
