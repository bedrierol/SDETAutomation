// Specify the package name for the class
package lesson2;

// Import the required Selenium classes
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for interacting with the browser
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "GetMethods"
public class GetMethods {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) {
        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("https://www.google.com/");

        // Print the current URL of the page displayed in the browser
        System.out.println("Current Url: " + driver.getCurrentUrl());

        // Print the title of the current page
        System.out.println("Page Title: " + driver.getTitle());

        // Navigate to Orion's homepage
        driver.get("https://www.orioninc.com");

        // Print the current URL of the Orion homepage
        System.out.println("Current Url: " + driver.getCurrentUrl());

        // Print the title of the Orion homepage
        System.out.println("Page Title: " + driver.getTitle());

        // (Optional) Uncomment the line below to print the HTML source code of the current page
        // System.out.println("page source: " + driver.getPageSource());

        // Print the unique identifier (window handle) for the current browser window
        System.out.println("Window Handle: " + driver.getWindowHandle());
    }
}
