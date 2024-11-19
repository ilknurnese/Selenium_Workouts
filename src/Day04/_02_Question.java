package Day04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Question extends BaseDriver {

    //    Senaryo: (Sadece CSSSelector)
//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculator'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu yazdırınız.

    @Test
    public void Test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculatorLink=driver.findElement(By.cssSelector("#calculatetest"));
        // WebElement calculatorLink=driver.findElement(By.cssSelector("[id=calculatetest]"));
        calculatorLink.click();
        MyFunc.Bekle(2);

        WebElement firstNumber=driver.findElement(By.cssSelector("input[id='number1']"));
        firstNumber.click();
        firstNumber.sendKeys("2");
        MyFunc.Bekle(2);

        WebElement secondNumber=driver.findElement(By.cssSelector("input[id='number2']"));
        secondNumber.sendKeys("5");
        MyFunc.Bekle(2);

        WebElement operation=driver.findElement(By.cssSelector("select[id='function']>:nth-child(1)"));
        operation.click();
        MyFunc.Bekle(2);


        WebElement calculateButton=driver.findElement(By.cssSelector("input[type='submit'][id='calculate']"));
        calculateButton.click();
        MyFunc.Bekle(2);

        WebElement result=driver.findElement(By.cssSelector("span[id='answer']"));
        System.out.println("result.getText() = " + result.getText());
        String resultText=result.getText();
        //System.out.println("Sonuç: " + resultText);




        // TODO: Assert.assertTrue(); sonucun doğruluğunu kontrol ediniz

        int expected = 2 + 5;
        Assert.assertEquals(Integer.parseInt(resultText), expected, "Sonuç doğru değil!");


        TearDown();





    }



}
