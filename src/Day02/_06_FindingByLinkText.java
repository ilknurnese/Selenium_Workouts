package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");


        WebElement siparilerimLinki = driver.findElement(By.linkText("Siparişlerim"));

        // link görünen texti Siparişlerim olan a tag li ELEMANI bul

        //PartialLinktext : Linkin görünen yazısının bir kısmını selector olarak kullanabilirsiniz.
        WebElement link2=driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());




        try{
            Thread.sleep(3*1000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
