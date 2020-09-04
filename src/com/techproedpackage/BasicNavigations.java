package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe");
        ////CHORME drivee olusuturun
        WebDriver driver= new ChromeDriver();
        // https://www.google.com/ adresinden goohle ana sayfasina acin

        driver.get("https://www.google.com/");
        //driver.get(" https://www.amazon.com/");

        //1.Navigate to amazon home page  https://www.amazon.com/
        //2. Navigate back to google
        //3. Navigate forward to amazon
        //4. Refresh(yenile) the web page
        //5. Maximize the window
        //6. Close/Quit the browser

        //  1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();  // 2. Navigate back to google(bir onceki sayfaya doner)
        driver.navigate().forward(); // 3. Navigate forward to amazon(tekrar sonraki sayfaya yani amazona gider)
        driver.navigate().refresh();// 4. Refresh(yenile) the web page(en son bulundugu sayfayi yeniler)
        driver.manage().window().maximize();// 5. Maximize the window
        driver.close(); //  6. Close/Quit the browse

        //navigate().to(); ve get(); metodlari neredeyse ayni islemi yapar.
        //Farklari -->
        //get(); --> url yi acar.sayfanin yuklenmesini bekler. Bir onceki sayfaya donemezsiniz.
        //navigate().to(); --> url yi acar. Sayfanin yuklenmesini beklemez. navigate back ve forward yapabilirsiniz.


    }
}
