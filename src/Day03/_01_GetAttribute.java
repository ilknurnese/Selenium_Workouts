package Day03;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetAttribute {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparislerimLinki.getText() = " + siparislerimLinki.getText());

        //Bir Web elementinin Attribute larını alma
        //To take the attributes of a Web Element

        System.out.println("siparislerimLinki.getAttribute(\"href\") = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));




        try{
            Thread.sleep(3000L);

        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
