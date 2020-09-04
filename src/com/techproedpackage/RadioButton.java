package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) {


    //   Facebook web sayfasına gidin.  https://www.facebook.com/
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");




       //Radio button elementlerini locate edin.
        WebElement female = driver.findElement(By.cssSelector("#u_0_6"));
        WebElement male = driver.findElement(By.cssSelector("#u_0_7"));
        WebElement custom = driver.findElement(By.cssSelector("#u_0_8"));
        //Seçili değilse istediginiz radio buttonu  tıklayın.
        female.click();
//        if(!male.isSelected()){   //true
//            male.click();
//        }else{
//            System.out.println("Male seçeneği zaten seçili");
//        }



    // Seçili değilse istediginiz radio buttonu  tıklayın.

    }

}
