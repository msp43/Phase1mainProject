package Amazon_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CartConfirmation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        // Assume you have added products to the cart, and there is a cart icon
        WebElement cartIcon = driver.findElement(By.id("nav-cart"));
        Actions actions = new Actions(driver);
        actions.moveToElement(cartIcon).perform();
        Thread.sleep(3000);

        // Click on the "Proceed to Checkout" button in the confirmation box
        WebElement proceedToCheckoutButton = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
        proceedToCheckoutButton.click();
        Thread.sleep(3000);

        // Now you can interact with the elements on the checkout page
        // For example, you can fill in shipping details, payment information, etc.

        // After completing the checkout process, you may get a confirmation message
        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@class='confirmation-message']"));
        String confirmationText = confirmationMessage.getText();
        System.out.println("Confirmation Message: " + confirmationText);

        // Close the browser
        driver.quit();
    }
}
