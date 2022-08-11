package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathselectorsstartswithmethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo");
        if(driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed())
        {
            System.out.println("element is found");
            driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();
        }
        else
            System.out.println("element is not found");
    }
}
