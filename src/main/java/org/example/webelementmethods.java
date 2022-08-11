package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webelementmethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://amazon.com");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")).click();
      //  driver.findElement(By.xpath("<span class=\"nav-action-inner\">Sign in</span>")).click();
       driver.findElement(By.name("email")).sendKeys("shalinikancharla92@gmail.com");
      // driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
     driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("08f91a0492");
        driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("login")).click();
       String txt= driver.findElement(By.id("nav-logo-sprites")).getText();
        System.out.println(txt);
        if(txt.equals("amazon"))
        {
            System.out.println("txt is correct");

        }
        else
            System.out.println("txt is not correct");


    }
}
