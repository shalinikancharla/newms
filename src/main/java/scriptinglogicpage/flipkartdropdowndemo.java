package scriptinglogicpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class flipkartdropdowndemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://flipkart.com");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
       //WebElement element= driver.findElement(By.xpath("//div[text()='More'] "));

        //List<WebElement> options=select.getOptions();
       // for (WebElement e: options )
       // {
         //   System.out.println(e.getText());
       // }
       //select.selectByIndex(3);

    }
}
