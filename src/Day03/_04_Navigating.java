package Day03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Navigating extends BaseDriver {
    public static void main(String[] args) {

        //driver.get("https://testpages.herokuapp.com/styled/index.html");

        // driver.navigate().to("url");  allows you to use navigate methods
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        WebElement linkAlert = driver.findElement(By.id("alerttest"));
        linkAlert.click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().back();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());
        MyFunc.Bekle(2);

        driver.navigate().forward();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl = " + driver.getCurrentUrl());

        TearDown();

    }
}
