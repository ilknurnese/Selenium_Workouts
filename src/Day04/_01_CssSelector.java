package Day04;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector extends BaseDriver {

    @Test
    public void Test1(){

// 1- go to https://formsmarts.com/form/yu?mode=h5
// 2- Select Business .
// 3- Click discover XYZ snd choose online Advertising
// 4- Choose Every day
// 5- Choose Good
// 6- Click to using XYZ and select the 3rd option

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        WebElement business= driver.findElement(By.cssSelector(""));


    }
}
