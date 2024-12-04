// Specify the package name for the class
package lesson2;

// Import required Selenium classes
import org.openqa.selenium.Dimension; // Import the Dimension class to handle browser size
import org.openqa.selenium.Point; // Import the Point class to handle browser position
import org.openqa.selenium.WebDriver; // Import the WebDriver interface for browser control
import org.openqa.selenium.edge.EdgeDriver; // Import the EdgeDriver class to control the Edge browser

// Define the public class named "ManageMethods"
public class ManageMethods {
    // The main method serves as the entry point for the Java application
    public static void main(String[] args) throws InterruptedException {
        // Initialize a new instance of the EdgeDriver to launch the Edge browser
        WebDriver driver = new EdgeDriver();

        // Maximize the browser window (currently commented out)
        // driver.manage().window().maximize();

        // Navigate to the demo site
        driver.get("https://demoqa.com");

        // Pause the execution for 5 seconds (currently commented out)
        // Thread.sleep(5000);

        // Switch to fullscreen mode (currently commented out)
        // driver.manage().window().fullscreen();

        // Pause execution for 5 seconds after fullscreen (currently commented out)
        // Thread.sleep(5000);

        // Minimize the browser window (currently commented out)
        // driver.manage().window().minimize();

        // Print the current size of the browser window
        System.out.println("Browser size: " + driver.manage().window().getSize());

        // Set the browser window size to 100px width and 500px height
        driver.manage().window().setSize(new Dimension(100, 500));

        // Print the updated size of the browser window
        System.out.println("Updated size: " + driver.manage().window().getSize());

        // Print the current position of the browser window
        System.out.println("Current Position: " + driver.manage().window().getPosition());

        // Set the browser window position to (100, 100) on the screen
        driver.manage().window().setPosition(new Point(100, 100));

        // Print the updated position of the browser window
        System.out.println("Updated Position: " + driver.manage().window().getPosition());
    }
}
