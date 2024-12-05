package lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeFormSubmission {

    public static void main(String[] args) throws InterruptedException {
        // Configure ChromeOptions to run the browser in headless mode (without GUI)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        // Initialize the WebDriver with ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the target URL
        driver.get("https://demoqa.com");
        driver.manage().window().maximize(); // Maximize the browser window

        // Locate the 'Forms' section card on the homepage and click on it
        WebElement form = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][2]"));
        form.click();

        // Locate the 'Practice Form' link and check if it is displayed
        WebElement practice_form = driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]"));
        System.out.println("Practice form is displayed if response is true:" + practice_form.isDisplayed());

        // Click on the 'Practice Form' button to navigate to the form
        WebElement practice_form_button = driver.findElement(By.xpath("//div[@class='element-list collapse show']"));
        practice_form_button.click();

        // Fill out the 'First Name' field
        WebElement first_name = driver.findElement(By.cssSelector("#firstName"));
        first_name.sendKeys("John");

        // Fill out the 'Last Name' field
        WebElement last_name = driver.findElement(By.cssSelector("#lastName"));
        last_name.sendKeys("Test");

        // Fill out the 'Email' field
        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("test@gmail.com");

        // Select the 'Male' gender radio button using JavaScript (since it's a hidden input element)
        WebElement genderMale = driver.findElement(By.cssSelector("#gender-radio-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", genderMale);

        // Fill out the 'Mobile Number' field
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("1234567890");

        // Click the 'Submit' button
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.submit(); // Alternatively, submitButton.click() can be used

        // Locate the header of the modal that appears after form submission
        WebElement header = driver.findElement(By.id("example-modal-sizes-title-lg"));

        // Extract and print the text of the modal header
        String headerText = header.getText();
        System.out.println("Header Text is: " + headerText);

        // Close the browser after execution
        //driver.quit();
    }
}
