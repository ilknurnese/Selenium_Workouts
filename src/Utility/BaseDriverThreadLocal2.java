package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriverThreadLocal2 {

//    If you plan to run tests in parallel,
//    it’s better to create independent WebDriver instances for each test
//    instead of using a static WebDriver.
//    You can achieve this by using ThreadLocal,
//    which allows each test to have its own WebDriver instance.
//
//    With ThreadLocal<WebDriver>,
//    each test class or test method gets its own isolated WebDriver instance.
//    This ensures that tests are independent of each other.
//    In parallel tests, each thread has its own WebDriver instance,
//    avoiding any conflicts or dependency issues.
//


    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver.get();
    }

    public static void tearDown() {
        if (driver.get() != null) {
            MyFunc.Bekle(3);
            driver.get().quit();
            driver.remove(); // ThreadLocal içindeki driver nesnesini temizler
        }
    }
}


