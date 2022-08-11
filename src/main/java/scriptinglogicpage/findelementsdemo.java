package scriptinglogicpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsdemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com");
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("shalinikancharla92@gmail.com");
       // driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("shalinikancharla92@gmail.com");
        driver.findElement(By.name("btnLogin")).click();
      //  driver.navigate().refresh();//dont run for next code we can use refresh method
        //open new window
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.navigate().to("https://demo.guru99.com/V4/#google_vignette");

    }
}
