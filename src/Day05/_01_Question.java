package Day05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _01_Question
        extends BaseDriver {


// Scenario
// 1- https://www.saucedemo.com/
// 2- Log in.
// 3- Click on Sauce Labs Backpack and add to cart.
// 4- Then go back (click on Back to products)
// 5- Click on Sauce Labs Bolt T-Shirt and add to cart.
// 6- Click on cart
// 7- Click on CheckOut
// 8- Fill in your user information and click on Continue
// 9- Test with Assert whether the total of the prices of each item here is equal to the
// Item total below.
//
// This question will use XPATH completely.
// Assert.assertTrue(productPriceTotal == itemTotal)

    @Test
    public void Test1(){

        driver.get("https://www.saucedemo.com/");
        MyFunc.Bekle(2);

        WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(2);

        WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
        MyFunc.Bekle(2);

        // 3- Click on Sauce Labs Backpack and add to cart.
        WebElement backpack = driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='Sauce Labs Backpack']"));
        backpack.click();
        MyFunc.Bekle(2);

        WebElement addToCart1= driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart1.click();
        MyFunc.Bekle(2);

        // 4- Then go back (click on Back to products)
        WebElement backToProducts=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(2);

        // 5- Click on Sauce Labs Bolt T-Shirt and add to cart.
        WebElement tShirt= driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        tShirt.click();
        MyFunc.Bekle(2);

        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCart2.click();
        MyFunc.Bekle(2);

        // 6- Click on cart
        WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();
        MyFunc.Bekle(2);

        // 7- Click on CheckOut
        WebElement checkout= driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();
        MyFunc.Bekle(2);

        // 8- Fill in your user information and click on Continue
        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Nese");
        MyFunc.Bekle(2);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Tuncal");
        MyFunc.Bekle(2);

        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("PE8 4AT");
        MyFunc.Bekle(2);

        WebElement continueBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        continueBtn.click();
        MyFunc.Bekle(2);

        // 9- Test with Assert whether the total of the prices of each item here is equal to the
        // Item total.

//        List<WebElement> prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

//        double totalOfElements=0.0;
//        for(WebElement webElement: prices)
//        {
//            System.out.println(webElement.getText());
//            System.out.println( webElement.getText().replaceAll("[^0-9,.]","")   ); //replace("$","");
//
//            totalOfElements = totalOfElements + Double.parseDouble(webElement.getText().replaceAll("[^0-9,.]", ""));
//        }
//
//        WebElement totalPrice=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
//        double subTotal= Double.parseDouble( totalPrice.getText().replaceAll("[^0-9,.]",""));
//        System.out.println("subTotal = " + subTotal);
//
//
//        Assert.assertTrue("Prices are not equal", subTotal == totalOfElements);

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double totalOfItems = 0;
        for (WebElement webElement : prices) {
            System.out.println(webElement.getText());
            System.out.println(webElement.getText().replaceAll("[^0-9.]", ""));

            totalOfItems += Double.parseDouble(webElement.getText().replaceAll("[^0-9.]", ""));
        }

        WebElement totalPrice = driver.findElement(By.xpath("//div[contains(@class, 'summary_subtotal_label')]"));
        double subTotal = Double.parseDouble(totalPrice.getText().replaceAll("[^0-9.]", ""));
        System.out.println("subTotal = " + subTotal);

        Assert.assertEquals("Prices are not equal", totalOfItems, subTotal, 0.01);








        TearDown();

    }



}
