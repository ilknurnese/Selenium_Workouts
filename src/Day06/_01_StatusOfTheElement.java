package Day06;

import Utility.BaseDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_StatusOfTheElement extends BaseDriver {

@Test
        public void Test1() {

    driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

    WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

    System.out.println("sali.isDisplayed() = " + tuesday.isDisplayed());
    System.out.println("sali.isEnabled() = " + tuesday.isEnabled());
    System.out.println("sali.isSelected() = " + tuesday.isSelected());

    tuesday.click();
    System.out.println("sali.isSelected() = " + tuesday.isSelected()); // true


    WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
    System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed()); // true
    System.out.println("saturday.isEnabled() = " + saturday.isEnabled()); //false
    System.out.println("saturday.isSelected() = " + saturday.isSelected()); //false

    Assert.assertTrue(saturday.isDisplayed() == true);

    TearDown();

}
}
