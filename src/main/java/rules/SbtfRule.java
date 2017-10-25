package rules;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SbtfRule extends ExternalResource {
    private WebDriver driver;

    private static final String baseUrl = "http://www.sberbank.ru/ru/person";

    public void before(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void after(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
