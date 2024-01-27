// Homework18.java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework18 {

    private WebDriver driver;

    @Test
    public void playSong() {
        // Initialize WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Step 8: Navigate to "https://qa.koel.app/"
        driver.get("https://qa.koel.app/");

        // Step 9: Log in with your credentials (assuming you have username and password fields)
        login("your_username", "your_password");

        // Step 10: Click «Play next song» (media player controls), then the Play button, to play a song.
        playNextSong();

        // Step 11: Validate that a song is playing by verifying if the sound bar or the pause button is displayed.
        validateSongPlaying();

        // Close the browser
        driver.quit();
    }

    private void login(String username, String password) {
        // Assuming you have username and password fields on the login page
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    private void playNextSong() {
        // Assuming there is a "Play next song" button and a "Play" button in the media player controls
        WebElement playNextButton = driver.findElement(By.id("playNextButton"));
        WebElement playButton = driver.findElement(By.id("playButton"));

        playNextButton.click();
        playButton.click();
    }

    private void validateSongPlaying() {
        // Assuming there is a sound bar or pause button that indicates a song is playing
        WebElement soundBar = driver.findElement(By.id("soundBar"));
        WebElement pauseButton = driver.findElement(By.id("pauseButton"));

        // Validate either the sound bar or pause button is displayed
        assert soundBar.isDisplayed() || pauseButton.isDisplayed() : "Song is not playing!";
    }
}

