package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xpath {
    public static void main(String[] args) {
//        Kullanici http://a.testaddressbook.com/sign_in adresine gitsin.
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
//        Locate email textbox
        WebElement emailTextBix= driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailTextBix.sendKeys("testtechproed@gmail.com");


        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@type='password']"));
        passwordTextBox.sendKeys("Test1234!");

        //Locate signin button
        WebElement signinButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signinButton.click();

        driver.manage().window().maximize();

//        Locate password textbox ve


//        Locate signin button
//        Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
//        Username :  testtechproed@gmail.com
//        Password : Test1234!
//                Ardından, beklenen(expected) user id  testtechproed@gmail.com dogrulayin(verify)
                 //user id locate
        WebElement userID= driver.findElement(By.xpath("//span[.='testtechproed@gmail.com']"));
        String actualUserID= userID.getText();
        String expectedUserID= "testtechproed@gmail.com";

        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+actualUserID);
            System.out.println("EXPECTED USER ID: "+ expectedUserID);
        }


//                Addresses ve Sign Out metinlerinin görüntülendiğini(isDisplayed) doğrulayin.
                                                                       //tagNmae[.='text name']
                WebElement addressesLink= driver.findElement(By.xpath("//a[.='Addresses']"));
        System.out.println("ADDRESESE LINK TEXT: "+addressesLink.getText());


        // SIGNIN out locate

        WebElement signinOutLinki= driver.findElement(By.xpath("//a[.='Sign out']"));
        System.out.println("SIGNIN OUT LINK TEXT: "+signinOutLinki.getText());

//                Sayfadaki toplam link sayısını bulun ve konsolda yazdirin.

        List<WebElement> listOfLinkElement= driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki toplam link saysis: "+listOfLinkElement.size());

        for(WebElement element : listOfLinkElement ){
            System.out.println(element.getText());
        }

//                Sayfadan çıkış yapın(Sign Out)
        signinOutLinki.click();

    }
}
