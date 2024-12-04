// Specify the package name for the class
package lesson3;

// Import required Selenium classes
import org.openqa.selenium.By; // Import the By class for locating elements on the webpage
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.WebElement; // Import the WebElement class for interacting with web elements
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "FindElement"
public class FindElement {

    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {
        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Sauce Demo login page
        driver.get("https://www.saucedemo.com/");

        // Locate the username input field by its ID attribute ("user-name")
        WebElement userNameInputField = driver.findElement(By.id("user-name"));

        // Type the text "Baris" into the located username input field
        userNameInputField.sendKeys("Baris");

        // Pause execution for 10 seconds to observe the input (using Thread.sleep)
        try {
            Thread.sleep(10000); // Time is specified in milliseconds (10 seconds)
        } catch (InterruptedException e) {
            // Handle any interruption exceptions that occur during Thread.sleep
            throw new RuntimeException(e);
        }

        // Clear the text from the username input field
        userNameInputField.clear();
    }
}
