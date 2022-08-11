import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {
    public static  void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.get("https://saucedemo.com");
                driver.findElement(By.id("user-name")).sendKeys("standard_user");
                driver.findElement(By.id("password")).sendKeys("secret_sauce");
                driver.findElement(By.id("login-button")).click();
                //select the dropdownlist one by one using select methods
                WebElement element=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
                Select select=new Select(element);
                select.selectByValue("az");
                select.selectByIndex(2);
                select.selectByVisibleText("Price (high to low)");
        //check multiple times
       // boolean multiplelist=select.isMultiple();
       // System.out.println(multiplelist);

           }
}
