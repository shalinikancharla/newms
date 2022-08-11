package scriptinglogicpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownlistdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://guru99.com/demo/v4/");
        driver.findElement(By.xpath("//*[@id=\"menu-item-3173\"]")).click();
        //WebElement element=driver.findElement(By.xpath("//*[@id=\"menu-item-3173\"][1]"));
        Actions action=new Actions(driver);
        //action.moveToElement(element).click(element).build().perform();
        WebElement element1=driver.findElement(By.id("wp-block-search__input-1"));
        action.moveToElement(element1).click(element1).sendKeys("SAP").sendKeys(Keys.ENTER).perform();

           }
}
