package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirtSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        //url gitmek icin get() methodu kullaniyoruz.
        driver.get("https://www.google.com");

        Thread.sleep(3000);//Bekleme suresi(3sn) wait

        // close() ve quit() her iki methodta tarayiciyi kapatir.
        // close() mevcut sayfayi kapatir quite() ==> acilan tum sayfalari kapatir.closa gore daha gucludur.

        driver.quit();
    }
}
