package Day07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _01_ActionClick extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demoqa.com/buttons");

        WebElement btnClick=driver.findElement(By.xpath("//button[text()='Click Me']"));
        // btnClick.click();

        Actions actions=new Actions(driver);

        actions.moveToElement(btnClick).click().build();

        MyFunc.Bekle(2);
        actions.perform();

        TearDown();

    }
}
