import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class samplepr {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://stock.amolujagare.com/");

        //login to the page using findelements with tagname input

        List<WebElement> loginlst=driver.findElements(By.tagName("input"));
        System.out.println("size:"+loginlst.size());
        loginlst.get(0).sendKeys("admin");
        loginlst.get(1).sendKeys("admin");
        loginlst.get(2).click();

        //click on add customer

        driver.findElement(By.xpath("//a[text()='Add Customer']")).click();

        driver.findElement(By.xpath("//a[text()='View Customers']")).click();
        driver.findElement(By.xpath("//tr[td[text()='laxmi']]/td/input")).click();

    }

}
