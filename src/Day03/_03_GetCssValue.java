package Day03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetCssValue {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement searchBox= driver.findElement(By.id("inputValEnter"));

        //provides value of the parameter
        // parametlerin değerlerini veriyor
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));

        //provides the values that shapes the elements
        // elementi şekillendiren değerleri veriyor
        System.out.println("searchBox.getCssValue(\"color\") = " + searchBox.getCssValue("color"));
        System.out.println("searchBox.getCssValue(\"background\") = " + searchBox.getCssValue("background"));
        System.out.println("searchBox.getCssValue(\"font-size\") = " + searchBox.getCssValue("font-size"));
        System.out.println("searchBox.getCssValue(\"border\") = " + searchBox.getCssValue("border"));
        System.out.println("searchBox.getCssValue(\"font-family\") = " + searchBox.getCssValue("font-family"));

        MyFunc.Bekle(3);
        driver.quit();

    }
}
