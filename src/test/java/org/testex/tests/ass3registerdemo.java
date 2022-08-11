package org.testex.tests;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.List;

public class ass3registerdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.name("firstname")).sendKeys("Shalini");
        driver.findElement(By.name("lastname")).sendKeys("Kancharla");
        driver.findElement(By.name("email")).sendKeys("sudeeksha15543@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("9542817261");
        driver.findElement(By.name("password")).sendKeys("08f91a0492");
        driver.findElement(By.name("confirm")).sendKeys("08f91a0492");
        //subscribe the radio button
        if(driver.findElement(By.name("newsletter")).isDisplayed())
        {
            if(!driver.findElement(By.name("newsletter")).isSelected())
            {
                driver.findElement(By.name("newsletter")).click();
            }

        }
        //privacy check boxes
        if(driver.findElement(By.name("agree")).isEnabled())
        {
            driver.findElement(By.name("agree")).click();
        }
        //submit button
       // driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //verify the confirmation message
        String expected="Congratulations! Your new account has been successfully created!";
      String actual=driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]")).getText();
      if(actual.equals(expected))
      {
          System.out.println("It is a confirmation message");
      }
      else
          System.out.println("It is not a confirmation message");

      //once registered go to login page use linktext
        driver.findElement(By.linkText("login page")).click();//using linktext

        //here check the login link is displayed or not in the page
        if(driver.findElement(By.linkText("Login")).isDisplayed())
        {
            System.out.println("login link is displayed");
        }
        else
            System.out.println("login link is not displayed");
        driver.navigate().back();

        //use tagname

        List<WebElement> buttons=driver.findElements(By.tagName("button"));
        for(WebElement button :buttons)
        {
            System.out.println(button.getText());
        }
        //search box
        driver.findElement(By.name("search")).sendKeys("Desktops");
        driver.findElement(By.name("search")).sendKeys(Keys.ENTER);

       // driver.findElement(By.name("email")).sendKeys("sudeeksha15543@gmail.com");
        //driver.findElement(By.name("password")).sendKeys("08f91a042");
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();



    }
}
