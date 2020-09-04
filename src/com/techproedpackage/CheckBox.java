package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
//        Bir class oluşturun : CheckBox
//        Main method oluşturun ve aşağıdaki görevi  tamamlayın.
//        Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get(" https://the-internet.herokuapp.com/checkboxes");

//        Checkbox1 ve checkbox2 elementlerini locate edin.

        WebElement checkBox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        //        Checkbox1 seçili değilse onay kutusunu tıklayın.isSelected()
        //        //=>check box veya radio buttonlarinin secili olup olmadigini gosterir
        if(!checkBox1.isSelected()){
            checkBox1.click();
        } else {
            System.out.println("CheckBox1 daha once check edilmis");
        }



        WebElement cehckBox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        //        Checkbox2 seçili değilse onay kutusunu tıklayın
        if(!cehckBox2.isSelected()){
            cehckBox2.click();
        }else {
            System.out.println("CheckBox2 daha once check edilmis");
        }



    }
}
