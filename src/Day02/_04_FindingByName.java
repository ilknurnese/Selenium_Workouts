package Day02;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {

        // By.Name()
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "neşe" yazdırınız
        // 3-  soyad kutucuğuna "tuncal" yazdırınız

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        driver.manage().window().maximize();

        WebElement name=driver.findElement(By.name("q8_name[first]"));
        name.sendKeys("neşe");

        WebElement surname= driver.findElement(By.name("q8_name[last]"));
        surname.sendKeys("tuncal");
        surname.clear();
        surname.sendKeys("TUNCAL");

        WebElement submitButton=driver.findElement(By.id("input_2"));
        submitButton.click();

       //MyFunc.Bekle(3);

        try{
            Thread.sleep(3*1000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
