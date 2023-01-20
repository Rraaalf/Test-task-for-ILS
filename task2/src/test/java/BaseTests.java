import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.RegistrationPage;

public class BaseTests {

    private WebDriver driver;
    protected RegistrationPage registrationPage;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://u920152e.beget.tech/#");
        registrationPage = new RegistrationPage(driver);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
