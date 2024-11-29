package Day06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _04_Question extends BaseDriver {


    @Test
    public void Test1(){

// Test Scenario
// 1- Go to https://www.facebook.com/
// 2- Click on CreateNewAccount.
// 3- Enter your name, surname and email in the new window that opens.
// 4- Select your date of birth with the Select class

        // 1- Go to https://www.facebook.com/
    driver.get("https://www.facebook.com/");

        // 2- Click on CreateNewAccount.
        // a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']
        // a[href='/r.php']
        // //a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']
        // //a[text()='Create new account']
        // //*[@data-testid="open-registration-form-button"]

        WebElement createNewAccountBtn= driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));
        createNewAccountBtn.click();
        MyFunc.Bekle(2);

        // 3- Enter your name, surname and email in the new window that opens.

        WebElement firstname= driver.findElement(By.name("firstname"));
        firstname.sendKeys("Psyche");
        MyFunc.Bekle(2);

        WebElement lastname= driver.findElement(By.name("lastname"));
        lastname.sendKeys("Eros");
        MyFunc.Bekle(2);

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("psycheeros12345@gmail.com");
        MyFunc.Bekle(2);

        WebElement webDay= driver.findElement(By.id("day"));
        WebElement webMonth=driver.findElement(By.id("month"));
        WebElement webYear=driver.findElement(By.id("year"));

        Select javaDay=new Select(webDay);
        Select javaMonth=new Select(webMonth);
        Select javaYear=new Select(webYear);

        javaDay.selectByVisibleText("21");
        javaMonth.selectByVisibleText("Aug");
//        javaMonth.selectByValue("8");
        javaYear.selectByVisibleText("1979");
        MyFunc.Bekle(2);

        WebElement password=driver.findElement(By.id("password_step_input"));
        password.sendKeys("");
        MyFunc.Bekle(2);

        WebElement signUp=driver.findElement(By.name("websubmit"));
        signUp.click();

        TearDown();


    }
}
