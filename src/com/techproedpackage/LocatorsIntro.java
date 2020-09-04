package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsIntro {


    public static void main(String[] args) {

        //    Bir class oluşturun: LocatorsIntro
//    Main method oluşturun ve aşağıdaki görevi tamamlayın.
//            http://a.testaddressbook.com/sign_in  adresine gidiniz.
//    email textbox,password textbox, and signin button elementlerini locate ediniz..

//    Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:

//


        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get(" http://a.testaddressbook.com/sign_in");


        // emailTextBox locate
        //    Username :  testtechproed@gmail.com
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");//sendKeys(".....") texti text boxa gonderir

        //password text box locate
        //Password : Test1234!

        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        //sign in button locate
        WebElement signinButton= driver.findElement(By.name("commit"));
        signinButton.click();

        driver.manage().window().maximize();

       // Expected user id nin testtechproed@gmail.com  oldugunu dogrulayin(verify).
        WebElement userID= driver.findElement(By.className("navbar-text"));
        System.out.println("USER ID WEBELEMENT: "+userID);
      //  System.out.println("USER ID WEBELEMENT: "+userID.getText());//getText() methodu elementin gorunen metnini
        //verir. String return eder.

        String actualUserID= userID.getText();
        String expectedUserID= "testtechproed@gmail.com";

        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+actualUserID);
            System.out.println("EXPECTED USER ID: "+expectedUserID);

        }

        //1. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //By.LinkText() sadece linkler icin kullanilir.
        WebElement addressLinkText= driver.findElement(By.linkText("Addresses"));
        String actualAddressLinkText= addressLinkText.getText();
        String expectedAddressLinkText= "Addresses";

        if(actualAddressLinkText.equals(expectedAddressLinkText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL ADDRESS:"+actualAddressLinkText);
            System.out.println("EXPECTED ADDRESS: "+expectedAddressLinkText);
        }

      //  “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify)

        WebElement SignOutLink= driver.findElement(By.linkText("Sign out"));
        String actualSignOutLinkText= SignOutLink.getText();
        String expectedSignOutLinkText= "Sign Out";

        if(actualSignOutLinkText.equals(expectedSignOutLinkText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL SIGN OUT: "+actualSignOutLinkText);
            System.out.println("EXPECTED SING OUT: "+expectedSignOutLinkText);
        }

        WebElement homeLink= driver.findElement((By.partialLinkText("Home")));
        String actualHomeLinkText= homeLink.getText();
        String expectedHomeLinkText= "home";

        if(actualHomeLinkText.equals(expectedHomeLinkText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL LINK: "+actualHomeLinkText);
            System.out.println("EXPECTED LINK: "+expectedHomeLinkText);
        }

          //By.partialLinkText();

        WebElement addresPartialLink= driver.findElement(By.partialLinkText("Addresse"));
        String actualPartialLinkText= addresPartialLink.getText();
        System.out.println("ADDRESESE BY PARTIAL LINK TEXT: "+actualPartialLinkText);

        WebElement signoutPartialLink = driver.findElement(By.partialLinkText("Sign"));
        String actualsignoutPartialLinkText =signoutPartialLink.getText();
        System.out.println("SIGN OUT BY PARTIAL LINK TEXT: " + actualsignoutPartialLinkText);



        // Sayfadaki toplam link saysisini bulunu ve linkleri consolda yazdiriniz
        // findElement() metodu yalnizca tek bir element locate icin kullanilir. String return eder.
        //findElements() methdou birden fazzla elemnet return eder.List<WebElemen>

        List<WebElement> listOfWebElement= driver.findElements(By.tagName("a"));

        System.out.println("Bu wb sayfasinda : "+listOfWebElement.size()+ " tane link vardir.");

        //linkleri tek tek yazdiralim
        //3 tane link var. 1. elemnetin indexini 0 aliriz.
        System.out.println("1. webElment: "+listOfWebElement.get(0));
        //1. elementin consolda yazdrilmasi. 1 element icin index 0 alinir.
        System.out.println("1. link text: "+listOfWebElement.get(0).getText());
        //2. elemntin consolda yazdirlmasi. 2 elemnt icin index 1 alinri
        System.out.println("2. link text: "+listOfWebElement.get(1).getText());
        System.out.println("3. link text: "+listOfWebElement.get(2).getText());

        //for each kullnarak tum elementleri yazdirabilriz
        for(WebElement element: listOfWebElement){
            System.out.println(element.getText());
        }




    }


}
