import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.ProtectPage;
import pages.StorePage;
import pages.YouthPage;
import rules.SbtfRule;

public class cardInsuranceTest {
    private WebDriver driver;

    @Rule
    public SbtfRule rule=new SbtfRule();

    @Test
    public void testInsurance()throws Exception{
        driver=rule.getDriver();
        MainPage mainPage=new MainPage(driver);
        mainPage.openYouthPage();
        YouthPage youthPage=new YouthPage(driver);
        youthPage.openProtectPage();
        ProtectPage protectPage=new ProtectPage(driver);
        protectPage.openStorePage();
        StorePage storePage=new StorePage(driver);
        storePage.sendRequestStore();
    }
}
