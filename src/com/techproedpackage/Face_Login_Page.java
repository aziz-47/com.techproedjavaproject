package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/Dell/Documents/selenium dependencies/drivers/chromedriver.exe/");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        //2. username ve password gecerli mi test edin.
        //	Username = "testusername"
        //	Password  =  "testpassword"
        //	Step 1. locate username box
        WebElement emailTextBox= driver.findElement(By.xpath("//input[@type='email']"));
        emailTextBox.sendKeys("testusername");
        WebElement passwordTextBox= driver.findElement(By.xpath("//input[@name='pass']"));
        passwordTextBox.sendKeys("testpassword");

        //	Step 2. locate password box
        //	Step 3. locate signin button
        WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
        //	Step 4. click sign in button

      //  loginButton.click();

        //Aynı classi kullanarak;
        //1.Asagidaki web elementlerini locate edin ve textlerini konsolda yazdirin.
        //"Sign Up"
        WebElement createaccount = driver.findElement(By.xpath("//span[.='Create an account']"));
        System.out.println("SIGN UP TEXT: " + createaccount.getText());
         //"Connect with friends and the world around you on Facebook."
        WebElement element= driver.findElement(By.xpath("//div[@class='_5iyx']"));
        System.out.println("Elment Text: "+element.getText());
        //2.First name , Last name, Mobile number or email, New password text boxlarini locate edin ve verilen test datalarini text boxlara gonderin.
        //verilen test datalarini texy boxlar
        //First name = testfirstname
        WebElement firstName= driver.findElement(By.id("u_0_o"));
        firstName.sendKeys("testfirstname");
        //Last name = testlastname
        WebElement lastName= driver.findElement(By.id("u_0_q"));
        lastName.sendKeys("testlastname");
      //Mobile number or email = test@gmail.com
        WebElement mobalNumber= driver.findElement(By.id("u_0_t"));
        mobalNumber.sendKeys("test@gmail.com");
        //New Password = testpassword
        WebElement newPassword= driver.findElement(By.id("password_step_input"));
        newPassword.sendKeys("testpassword");

    }


}
