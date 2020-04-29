import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void intializeBrowser()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        DesiredCapabilities chrome = new DesiredCapabilities();
        chrome.setJavascriptEnabled(true);
        option.setCapability(ChromeOptions.CAPABILITY, option);

        //Create driver object for Chrome
        driver = new ChromeDriver(option);
    }
}