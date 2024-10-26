package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class _01_FindById {
    public static void main(String[] args) {

        /*
        1 - open the web site https://form.jotform.com/221934510376353
        2- write Neşe to first name text area
        3- write Tuncal to last name  text area

        */

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        //start the session
        WebDriver driver = new ChromeDriver();

        //navigate to the webpage
        driver.get("https://form.jotform.com/221934510376353");

        //request a browser information
        driver.getTitle();
        System.out.println(driver.getTitle());

        //waiting
        //Synchronizing the code with the current state of the browser is
        // one of the biggest challenges with Selenium,
        // and doing it well is an advanced topic.
        //
        //Essentially you want to make sure that
        // the element is on the page
        // before you attempt to locate it
        // and the element is in an interactable state
        // before you attempt to interact with it.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        //Find the first name and the last name textboxes
        // when you inspect on the web page ,
        // you can use # symbol to find the element by ID.
        // write #first_8 on the search box to find the first name text box

        WebElement firstName = driver.findElement(By.id("first_8"));
        firstName.sendKeys("Neşe");

        WebElement lastName = driver.findElement(By.id("last_8"));
        lastName.sendKeys("Tuncal");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
