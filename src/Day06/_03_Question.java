package Day06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _03_Question extends BaseDriver {

    @Test
    public void Test1() {

// Test Scenario
// 1- Go to https://www.ebay.co.uk/
// 2- Select Baby from the categories.
// 3- Click the search button.
// 4- Verify that the word Baby is in the left heading
// section on the screen where the results appear

        // 1- Go to https://www.ebay.co.uk/
        driver.get("https://www.ebay.co.uk/");
        MyFunc.Bekle(2);

        // 2- Select Baby from the categories.
        /*
        //select[@id='gh-cat']
        #gh-cat
        [id='gh-cat']
        select[id='gh-cat']

         */

        WebElement selectBabyFromCategories = driver.findElement(By.id("gh-cat"));

        Select selectBaby = new Select(selectBabyFromCategories);

        selectBaby.selectByVisibleText("Baby");
       // selectBaby.selectByValue("2984");
        MyFunc.Bekle(2);


        // 3- Click the search button.

        /*

        input[id='gh-ac']
        //input[@id='gh-ac']

        */

        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();
        MyFunc.Bekle(2);


        // 4- Verify that the word Baby is in the left heading
        // section on the screen where the results appear

        // h1[class='textual-display page-title']
        //WebElement titleBaby = driver.findElement(By.xpath("//h1[contains(@class, 'textual-display') and contains(@class, 'page-title')]"));
        WebElement titleBaby = driver.findElement(By.cssSelector("h1.textual-display.page-title"));

        Assert.assertTrue("The word is not found", titleBaby.getText().contains("Baby"));



        TearDown();

    }
}
