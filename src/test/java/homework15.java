import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

public class Homework15 extends BaseTest {

    @Parameters({"BaseUrl"})
    @Test
    public void loginToTestPro(String baseUrl) throws InterruptedException {
        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to the new URL
        driver.get(baseUrl);

        // Pause for 2 seconds
        Thread.sleep(2000);

        // Close the browser
        driver.quit();
    }
}
