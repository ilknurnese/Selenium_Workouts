package Day03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating_2 extends BaseDriver {

    @Test
    public void Test1() {

//        @Test:
//        This annotation marks the Test1 method as a test case.
//        It tells the JUnit framework to run this method as a test when you execute your test suite.
//
//        public void Test1():
//        This is the first test method in this class.
//        With the @Test annotation, JUnit will run Test1() as part of the test suite.
//
//        To make this test operational,
//        you’ll want to add test actions and assertions inside Test1()
//        to interact with the web elements or verify certain conditions on the page.
//        For example, you might want to navigate to a URL,
//        check page elements, or assert conditions like in your previous code with Assert.assertTrue.


        //public static void main(String[] args) {   !!  delete this

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement linkAlert = driver.findElement(By.id("alerttest"));
        linkAlert.click();
        MyFunc.Bekle(2);

        driver.navigate().back();
        MyFunc.Bekle(2);

        driver.navigate().forward();

//        if (driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"))
//            System.out.println("Test passed");
//        else
//            System.out.println("Test fail");

//        The assertion here is checking if the current URL of the webpage matches the expected URL.
//        It uses Assert.assertTrue to validate the condition,
//        and if the condition is not met (i.e., the URL does not match),
//        the test will fail with the specified message: "The Web Page failed to load".
//
//      Here’s the breakdown of how it works:
//
//       driver.getCurrentUrl() retrieves the URL of the page currently loaded in the browser.
//
//      .equals("https://testpages.eviltester.com/styled/alerts/alert-test.html") checks
//      if this URL matches the expected URL.
//
//      Assert.assertTrue validates that this condition is true.
//
//      If it’s false, the test fails and displays the message "The Web Page failed to load".
//

        Assert.assertTrue("The Web Page failed to load", driver.getCurrentUrl().equals("https://testpages.eviltester.com/styled/alerts/alert-test.html"));

        TearDown();
    }
}