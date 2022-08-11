package org.testex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class flipkartp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[2]")).click();
        driver.findElement(By.className("_1kidPb")).click();


        //Select select=new Select(driver.findElement(By.className("_1kidPb")));
        //List<WebElement> options=select.getOptions();
        //for(WebElement e : options)
        //    System.out.println(e.getText());
    }
}
