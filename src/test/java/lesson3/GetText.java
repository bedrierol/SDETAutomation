// Specify the package name for the class
package lesson3;

// Import required Selenium classes
import org.openqa.selenium.By; // Import the By class for locating elements
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.WebElement; // Import the WebElement class for interacting with elements
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "GetText"
public class GetText {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {
        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Sauce Demo login page
        driver.get("https://www.saucedemo.com/");

        // Locate the element with the class name "login_logo"
        WebElement element = driver.findElement(By.className("login_logo"));

        // Retrieve and print the visible text of the "login_logo" element
        System.out.println("Login page has text: " + element.getText());

        // Locate the element with the class name "login_credentials"
        WebElement loginCredentials = driver.findElement(By.className("login_credentials"));

        // Retrieve and print the visible text of the "login_credentials" element
        System.out.println("Login page has login credentials text: " + loginCredentials.getText());
    }
}