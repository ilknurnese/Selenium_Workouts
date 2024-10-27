package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.TableHeaderUI;
import java.util.List;

public class _05_FindingByClassName {

    public static void main(String[] args) {


        // When you inspect in the browser,
        // you can put # for searches by id
        // and . for searches by class.

        // Browserda incele yaptığınızda id lerden aramalar için #, class aramalar için . konabilir.


        // Senaryo:
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  Bütün label ları bulup textlerini yazdırınız

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());

        System.out.println();
        // findElement: locator birden fazla elemanı işaret ediyorsa bile,
        // ilkini bulur

        // Birden fazla element bulma:
        // bütün elemanları almak için findElements   kullanılır
        System.out.println("All the elements having the same class name");
        System.out.println("----------------------------------------------");

        List<WebElement> elementler=driver.findElements(By.className("form-sub-label"));


        for (WebElement e:elementler)
            System.out.println("e.getText() = " + e.getText());

        System.out.println("elementler.size() = " + elementler.size());

        try
        {
            Thread.sleep(3);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}
