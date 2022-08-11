package org.testex.tests;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class optionsdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
       WebElement element=driver.findElement(By.name("country"));
       Select select=new Select(element);
       select.selectByIndex(0);
        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
       List<WebElement> options=select.getOptions();
        System.out.println("display alloptions");
        for(WebElement e: options)
        {
            System.out.println(e.getText());
        }
        System.out.println(" ");
        WebElement firstSelectedOption=select.getFirstSelectedOption();
        System.out.println("selected first option:"+ firstSelectedOption);
        List<WebElement> selopt=select.getAllSelectedOptions();
        System.out.println("selected options only");
        for(WebElement e: selopt)
        {
            System.out.print(e.getText());
        }
        boolean mul= select.isMultiple();
        System.out.println(mul);
        Select select1=new Select(driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")));
        select1.selectByIndex(0);
        select1.selectByIndex(1);



    }
}
