package Day03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Test;    // **

public class _04_Navigating_2 extends BaseDriver {

    @Test
    public void Test1(){


        //public static void main(String[] args) {


        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement linkAlert = driver.findElement(By.id("alerttest"));
        linkAlert.click();
        MyFunc.Bekle(2);

        driver.navigate().back();
        MyFunc.Bekle(2);

        driver.navigate().forward();

        TearDown();
    }
}