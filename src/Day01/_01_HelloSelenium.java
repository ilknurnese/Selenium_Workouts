package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_HelloSelenium {
    public static void main(String[] args) {


        /*
        Selenium is an umbrella project for a range of tools and libraries that enable and support the automation of web browsers.
        Selenium supports automation of all the major browsers in the market through the use of WebDriver.
        WebDriver is an API and protocol that defines a language-neutral interface for controlling the behaviour of web browsers.
        Each browser is backed by a specific WebDriver implementation, called a driver.
        The driver is the component responsible for delegating down to the browser, and handles communication to and from Selenium and the browser.

Driver Sessions:
Starting and stopping a session is for opening and closing a browser.
The session is created automatically by initializing a new Driver class object.

         */



        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

       /*
        WebDriver driver2 = new FirefoxDriver();
        WebDriver driver3 = new EdgeDriver();
       */

        // Open cukkos website
        driver.get("https://www.cukkos.net");

        //wait for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Close the browser
        driver.quit();
    }
}
