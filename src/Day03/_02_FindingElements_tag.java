package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _02_FindingElements_tag {
    public static void main(String[] args) {

        //amazon.com un sayfasındaki bütün linkler,
        //tıklanabilir ve görünen yazı

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");

        //bütün a olan tagli emenetleri bul
        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        System.out.println("linkler.size() = " + linkler.size());

        for (WebElement e: linkler){
            //if(!e.getText().equals("") && e.getAttribute("href").length()>0)
            if(!e.getText().equals("") && e.getAttribute("href")!=null)
                System.out.println("e.getText() = " + e.getText());
        }

        driver.quit();

    }
}
