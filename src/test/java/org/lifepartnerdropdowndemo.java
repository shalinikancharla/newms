package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import java.util.concurrent.TimeUnit;

public class lifepartnerdropdowndemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.lifepartner.in/");
        Select lookingfor=new Select(driver.findElement(By.id("sel3")));
       // select.selectByIndex(0);
        lookingfor.selectByVisibleText("Groom");
        Select agefrom=new Select(driver.findElement(By.id("sel1")));
          agefrom.selectByIndex(5);
        Select ageto=new Select(driver.findElement(By.id("sel2")));
        ageto.selectByVisibleText("31");
        Select Community=new Select(driver.findElement(By.name("cm")));
        Community.selectByValue("Hindu");
        Select maritalstatus=new Select(driver.findElement(By.id("sel5")));
        maritalstatus.selectByIndex(1);
        driver.findElement(By.name("ph")).click();
        driver.findElement(By.className("search-btn")).click();
       //in advanced search do operation on dropdown
        driver.findElement(By.linkText("//a[text()='Partner Search']")).click();




    }
}
