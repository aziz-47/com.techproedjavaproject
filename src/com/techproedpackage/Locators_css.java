package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_css {

    public static void main(String[] args) {
        //Bir class oluşturun : Locators_css
        //Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        // Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate email textbox
                          //tagName[attribute='value']
      WebElement emailTextBox= driver. findElement(By.cssSelector("input[type='email']"));
       emailTextBox.sendKeys("testtechproed@gmail.com");
        //Locate password textbox ve
                                                                      //tagName[attribute='value']
        WebElement passwordTexBox= driver.findElement(By.cssSelector("input[type='password']"));
        passwordTexBox.sendKeys("Test1234!");
        //Locate signin button
                                                                //tagNmae[attribute='value']
        WebElement signinButon= driver.findElement(By.cssSelector("input[type='submit']"));
        signinButon.click();
        //Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //Username :  testtechproed@gmail.com
        //Password : Test1234!

    }
}
