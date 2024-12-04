// Specify the package name for the class
package lesson3;

// Import required Selenium classes
import org.openqa.selenium.By; // Import the By class for locating elements
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.WebElement; // Import the WebElement class for interacting with elements
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "GetAttribute"
public class GetAttribute {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {
        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Sauce Demo login page
        driver.get("https://www.saucedemo.com/");

        // Locate the username input field using its ID attribute ("user-name")
        WebElement Username = driver.findElement(By.id("user-name"));

        // (Commented Out) Retrieve the value of the "autocapitalize" attribute and print it
        // System.out.println("Attribute " + Username.getAttribute("autocapitalize"));

        // (Commented Out) Retrieve the value of the "value" attribute before typing anything and print it
        // System.out.println("Value before typing username: " + Username.getAttribute("value"));

        // Type the text "TestUsername" into the username input field
        Username.sendKeys("TestUsername");

        // (Commented Out) Retrieve the value of the "value" attribute after typing the username and print it
        // System.out.println("Value after typing username: " + Username.getAttribute("value"));

        // (Commented Out) Use the `getText()` method to retrieve the visible text inside the element and print it
        // System.out.println("Username getText method: " + Username.getText());

        // Retrieve the value of the "value" DOM property (used for input elements) and print it
        System.out.println(Username.getDomProperty("value"));
    }
}
