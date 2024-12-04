// Specify the package name for the class
package lesson2;

// Import the required Selenium classes
import org.openqa.selenium.By; // Import the By class to locate elements on a webpage
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser interactions
import org.openqa.selenium.WebElement; // Import the WebElement interface to represent webpage elements
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "FindElement"
public class FindElement {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {
        // Create an instance of the ChromeDriver class to initialize the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Use the driver instance to navigate to the specified URL
        driver.get("https://www.google.com/");

        // Locate the search input area on Google's homepage by its ID attribute
        WebElement searcharea = driver.findElement(By.id("APjFqb"));

        // Type the text "Orion" into the located search input area
        searcharea.sendKeys("Orion");
    }
}
