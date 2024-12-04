// Specify the package name for the class
package lesson2;

// Import the required Selenium classes
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.chrome.ChromeDriver; // Import the ChromeDriver class to control the Chrome browser

// Define the public class named "NavigateMethods"
public class NavigateMethods {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) throws InterruptedException {
        // Initialize a new instance of the ChromeDriver to launch the Chrome browser
        WebDriver chromeDriver = new ChromeDriver();

        // (Commented Out) Navigate to Google's homepage and close the browser
        // chromeDriver.get("https://www.google.com/");
        // chromeDriver.quit();

        // Navigate to the Demo QA website
        chromeDriver.get("https://demoqa.com");

        // Navigate forward in the browser history (no effect here as no backward navigation has been performed)
        chromeDriver.navigate().forward();

        // Navigate to Google's homepage using the navigate().to() method
        chromeDriver.navigate().to("https://www.google.com/");

        // Pause the execution for 5 seconds to allow observation
        Thread.sleep(5000);

        // Refresh the current page (Google's homepage in this case)
        chromeDriver.navigate().refresh();
    }
}