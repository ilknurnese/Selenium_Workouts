package U02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class _02_FindByIdNotFoundException {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        //a wrong locator given
        try {
            WebElement textBox = driver.findElement(By.id("Wrong locator"));
        }catch (Exception ex){
            System.out.println("There is no such element in this locator" + ex.getMessage());
        }

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        // or we can write
        // MyFunc.Bekle(3);


        driver.quit();

    }
}
