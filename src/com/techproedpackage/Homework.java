package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        //1. Yeni bir class oluşturun :Homework
         //2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,V
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String actualFacebookTitle=driver.getTitle();
        String expectedFacebookTitle= "facebook";

        if(actualFacebookTitle.equals(expectedFacebookTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTAUL TITLE: "+actualFacebookTitle);
            System.out.println("EXPECTED TITLE: "+expectedFacebookTitle);
        }

         //3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
        String actualFacebookURL= driver.getCurrentUrl();
        String expectedFacebookURL="facebook";

        if(actualFacebookURL.contains(expectedFacebookURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL URL: "+actualFacebookURL);
            System.out.println("EXPECTED URL: "+expectedFacebookURL);
        }


         //4. Ardından Navigate to https://www.walmart.com/

        driver.navigate().to("https://www.walmart.com/");

         //5. Walmart sayfa başlığının “Walmart.com” içerip  içermediğini(contains) doğrulayın
        String actualWalmartTitle= driver.getTitle();
        String expectedWalmartTitle= "Walmart.com";

        if(actualWalmartTitle.contains(expectedWalmartTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL TITLE: "+actualWalmartTitle);
            System.out.println("EXPECTED TITLE: "+expectedWalmartTitle);
        }

          // 6. Navigate back to facebook
        driver.navigate().back();
        //7. Sayfayı yenileyin(refresh)
        driver.navigate().refresh();
        //   8. Maximize the window
        driver.manage().window().maximize();
        // 9. Close the browser
        driver.close();




    }


}
