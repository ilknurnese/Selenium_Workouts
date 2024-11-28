package Day06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _02_SelectClassIntro extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.amazon.com.tr/");
        MyFunc.Bekle(2);

        WebElement webSelect=driver.findElement(By.id("searchDropdownBox"));

        // You can create an object of the Select class,
        // by-passing the object of the "WebElement" class,
        // which shows the object returned by the corresponding locator of the WebElement.

        Select javaSelect=new Select(webSelect); // web select , Selenium Java daki Select e CAST ediliyor

        javaSelect.selectByIndex(2);
        MyFunc.Bekle(2);
        javaSelect.selectByValue("search-alias=electronics");
        MyFunc.Bekle(2);
        javaSelect.selectByVisibleText("PET accessories");
        MyFunc.Bekle(2);

        System.out.println("ddMenu.getOptions().size() = " + javaSelect.getOptions().size());

        for (WebElement element: javaSelect.getOptions())
            System.out.println("element.getText() = " + element.getText());

        TearDown();
    }
}
