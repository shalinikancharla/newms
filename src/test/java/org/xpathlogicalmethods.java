package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlogicalmethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test123");
        //if i given wrong usernme and password it will go to register page otherwise it will login
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();//and
        driver.findElement(By.xpath("//a[@class='btn btn-primary' or text()='Continue']")).click();//or

    }
}
