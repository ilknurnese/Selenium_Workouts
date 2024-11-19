package Day04;

import Utility.BaseDriver;
import Utility.MyFunc;
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

        WebElement business= driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();
        MyFunc.Bekle(2);

        WebElement dropDownDiscover=driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();
        MyFunc.Bekle(2);

        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("[id$='_4588'] > :nth-child(4)"));
        optionOnlineAdvertising.click();
        MyFunc.Bekle(2);

        WebElement everydayRadio=driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        everydayRadio.click();
        MyFunc.Bekle(2);

        WebElement goodRadio=driver.findElement(By.cssSelector("input[type=radio][value='Good']"));
        goodRadio.click();
        MyFunc.Bekle(2);

        WebElement dropdownHowLong=driver.findElement(By.cssSelector("select[id$='_4597']"));
        dropdownHowLong.click();
        MyFunc.Bekle(2);

        WebElement option3=driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        option3.click();
        MyFunc.Bekle(2);

        option3.click();
        MyFunc.Bekle(2);


    }
}
