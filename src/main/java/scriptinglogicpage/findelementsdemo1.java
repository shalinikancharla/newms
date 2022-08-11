package scriptinglogicpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class findelementsdemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
        //using findelements method with multiple tagnames at a time we can locate and perform actions
       List<WebElement> allinks =driver.findElements(By.tagName("a"));
       for(WebElement e : allinks)
       {
           System.out.println(e.getText());
       }
        System.out.println("links display:"+allinks.size());//display the size
       List<WebElement> webinput =driver.findElements(By.tagName("input"));
        System.out.println("input tagnames size"+webinput.size());
        //passing the values through get method
        webinput.get(0).sendKeys("mngr416716");
        webinput.get(1).sendKeys("unAgytA");
        webinput.get(2).click();
       // webinput.get(3).click();

        //select method
        WebElement element=driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
        Select select=new Select(element);
         select.selectByIndex(1);
        select.selectByVisibleText("Flash Movie Demo");
        select.selectByVisibleText("New Customer");


    }

}
