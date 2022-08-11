package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IntrenshalaProject {
    public static void main(String[] args) {
        {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://tutorialsninja.com/demo/");
            //Login with username and password
            driver.findElement(By.xpath("//a[@title='My Account']")).click();
            driver.findElement(By.xpath("//a[text()='Login']")).click();
            driver.findElement(By.id("input-email")).sendKeys("shalinikancharla92@gmail.com");
            driver.findElement(By.id("input-password")).sendKeys("08f91a0492");
            driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
            //select Show All Laptops and Notebooks in Laptops and Notebooks tab
            driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
            driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")).click();
            //Add the products into cart
            driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();//Macbook Air
            driver.findElement(By.xpath("(//button[@type='button'])[18]")).click();//MacBook Pro
            //See in Shopping cart
            driver.findElement(By.xpath("(//a[contains(@href, 'cart')])[1]")).click();
            //verify the products matching with their product names
           String actual= driver.findElement(By.xpath("(//a[text()='MacBook Air'])[2]")).getText();
            System.out.println("product name:"+actual);
           if(actual.equals("MacBook Air"))
           {
               System.out.println("Macbook Air product added in Shopping cart");
           }
           else
           {
               System.out.println("Macbook Air product is not added in Shopping cart");

           }
            String actual1= driver.findElement(By.xpath("(//a[text()='MacBook Pro'])[2]")).getText();
            System.out.println("Product Name:"+actual1);
           if(actual1.equals("MacBook Pro"))
            {
                System.out.println("Macbook Pro product added in Shopping cart");
            }
            else
            {
                System.out.println("Macbook pro product is not added in Shopping cart");

            }
            //verify the products price                                                                             //another way of finding element of amount
           String actualprice= driver.findElement(By.xpath("(//td[text()='$3,000.00'])[4]")).getText();//(//table[@class='table table-bordered'])[3]//tr[2]//td[2]
            if(actualprice.equals("$3,000.00"))
            {
                System.out.println("Showing actual price");
            }
            else
                System.out.println("not showing actual price");
            //Finally Checkout
            driver.findElement(By.xpath("//a[text()='Checkout']")).click();
            //driver.close();


        }
    }
}
