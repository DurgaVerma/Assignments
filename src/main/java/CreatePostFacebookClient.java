import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePostFacebookClient {
    public WebDriver driver;

    //Create driver object for Chrome
    CreatePostFacebookClient(WebDriver driver) {
        this.driver = driver;
    }

    public void toLoginOnFacebook(String email, String password,String message)
    {
        WebDriverWait wait = new WebDriverWait(driver,60);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement emailOrPhoneNo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='royal_email']")));
        emailOrPhoneNo.click();
        emailOrPhoneNo.sendKeys(email);
        WebElement paswrd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid='royal_pass']")));
        paswrd.click();
        paswrd.sendKeys(password);
        WebElement loginButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Log In']")));
        loginButton.click();
        WebElement writeSomething= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[contains(@title,'Write something')]")));
        writeSomething.click();
        writeSomething.sendKeys(message);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])[2]"))).click();

    }




}




