// Specify the package name for the class
package lesson3;

// Import required Selenium classes
import org.openqa.selenium.By; // Import the By class to locate elements
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.WebElement; // Import the WebElement interface to represent webpage elements
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Import Java's List interface for handling multiple elements
import java.util.List;

// Define the public class named "FindElements"
public class FindElements {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {

        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Sauce Demo login page
        driver.get("https://www.saucedemo.com/");

        // Locate all elements with the class name "form_group" and store them in a List
        List<WebElement> formGroup = driver.findElements(By.className("form_group"));

        // Print the total number of elements found on the Sauce Demo page with the class "form_group"
        System.out.println("Number of elements on SauceDemo: " + formGroup.size());

        // Navigate to the Guru99 demo page
        driver.get("http://demo.guru99.com/test/ajax.html");

        // Locate all elements with the name "name" and store them in a List
        List<WebElement> elements = driver.findElements(By.name("name"));

        // Print the total number of elements found on the Guru99 demo page with the name "name"
        System.out.println("Number of elements on DemoQA: " + elements.size());

        // Navigate to the TutorialsPoint homepage
        driver.get("https://www.tutorialspoint.com/index.htm");

        // Locate all link elements (with the tag name "a") and store them in a List
        List m = driver.findElements(By.tagName("a"));

        // Get the total number of link elements found
        int st = m.size();

        // Print the total number of links found on the TutorialsPoint page
        System.out.println("Number of links: " + st);
    }
}